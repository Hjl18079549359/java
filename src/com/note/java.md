基本类型转换





枚举

1、枚举是 JDK1.5 引入，使用 enum 定义，本质是继承 Enum 的特殊类，用来表示固定有限的常量集合。

2、它的构造方法默认私有，外部不能 new，所有实例都在内部提前定义好。

3、编译器会自动生成 values ()、valueOf 等方法，方便遍历和取值。

4、和传统静态常量相比，枚举类型更安全、支持属性和方法、配合 switch 使用更优雅。

5、枚举可以实现接口、定义抽象方法；同时它也是**最佳单例实现方式**，能抵御反射和序列化攻击。

6、日常多用于状态、性别、季节、订单类型等固定取值场景。

易错问答

**`Enum` 和 `enum` 区别？**

- `enum`：关键字，用来定义枚举类；
- `Enum`：java.lang 下的**父类**，所有枚举自动继承它。

**枚举可以被继承吗？**

不可以。枚举默认 final，无法被其他类继承。

**`==` 和 `equals()` 比较枚举？**

枚举对象全局唯一，**`==` 和 equals 效果完全一样**，推荐用 `==`。

### values(), ordinal() 和 valueOf() 方法

enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Serializable 和 java.lang.Comparable 两个接口。

values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：

- values() 返回枚举类中所有的值。
- ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
- valueOf()方法返回指定字符串值的枚举常量。

**ordinal () 可以用来做业务判断吗？**

**不建议**。一旦枚举顺序改动，序号全部错乱，业务出错。优先用名称或自定义编码。

**ordinal () 方法有什么用？什么情况会用到？**

你回答：

1. `ordinal()` 返回枚举常量的**定义顺序号，从 0 开始**。
2. 它的**设计目的是给 JDK 内部的 EnumMap 和 EnumSet 做索引使用**。
3. **业务代码不应该使用 ordinal ()**，因为枚举顺序一旦修改，序号会变，导致业务出错。
4. 业务需要编号时，应该**自己定义 code 字段**，不要依赖 ordinal。

------

## 六、超简总结

- **ordinal () = 枚举顺序号（0 开始）**
- **用途：给 EnumMap / EnumSet 用**
- **业务禁止使用！不安全！**
- **业务编号 → 自己写 code 字段**



手写代码

基础枚举（季节 / 星期）

带属性、私有构造、getter 的枚举（性别、状态）

含抽象方法的枚举

枚举配合 switch

枚举实现单例





java反射

### 1. 获取 Class 对象

每个类在 JVM 中都有一个与之相关的 Class 对象。可以通过以下方式获取 Class 对象：

**通过类字面量**（类名.class静态获取）

```
Class<?> clazz = String.class;
```

**通过对象实例：**（对象.getClass(),已有实例时使用）

```
String str = "Hello";
Class<?> clazz = str.getClass();
```

**通过 Class.forName(“全类名”) 方法：**

```
Class<?> clazz = Class.forName("java.lang.String");
```

### 1. `getXXX()` 和 `getDeclaredXXX()` 区别（高频）

1. getXXX
   - 只获取 **public** 成员
   - 包含**父类**的公有成员
2. getDeclaredXXX
   - 获取**本类中所有权限**成员（public/private/protected/default）
   - **不包含父类**成员

### 2. `setAccessible(true)` 作用

- 关闭 Java 权限检查，实现**暴力反射**
- 可以访问、调用类中 `private` 私有构造、字段、方法
- 安全层面存在风险

3.**什么是反射？**

运行状态下，通过 Class 对象获取类的结构，并操作构造、字段、方法的机制。

三、反射常用 API 分类

获取成员变量 Field

- `getFields()`：获取所有公共字段。
- `getDeclaredFields()`：获取所有声明的字段，包括私有字段。

获取成员方法 Method

- `getMethods()`：获取所有公共方法。
- `getDeclaredMethods()`：获取所有声明的方法，包括私有方法。

获取构造方法 Constructor

- `getConstructors()`：获取所有公共构造函数。
- `getDeclaredConstructors()`：获取所有声明的构造函数，包括私有构造函数。

### 获取接口和父类

- `getSuperclass()`：获取类的父类。
- `getInterfaces()`：获取类实现的所有接口。









# LinkedHashMap + accessOrder + LRU 面试完整层级笔记（含原理深挖+全套追问）

# 一、基础层：LinkedHashMap 核心概念（必问+原理深挖）

## 1. 底层数据结构？为什么要这么设计？

**标准答案（含原理）**：

LinkedHashMap 底层是 **HashMap 哈希表（数组+链表+红黑树）+ 全局双向链表** 的复合结构，两种结构各司其职，是兼顾**读写性能**和**有序性**的最优设计。

- **哈希表（数组+链表+红黑树）**：继承自 HashMap，核心作用是保证增、删、查操作的平均时间复杂度为**O(1)**。通过哈希算法对 key 计算哈希值，定位数组下标，快速命中元素，解决了纯链表查询效率低下的问题。
- **全局双向链表**：这是 LinkedHashMap 独有结构，不参与哈希寻址、不解决哈希冲突，仅负责**串联所有有效元素**，统一记录元素的插入/访问顺序，让集合具备有序特性。

**追问1：为什么不只用双向链表存储数据？**

如果仅用双向链表，所有查询、修改操作都需要遍历整个链表，时间复杂度为 O(n)，数据量越大效率越慢。而哈希表实现了精准下标定位，保证高效存取，双向链表只专职维护顺序，分工协作兼顾性能和有序性。

**追问2：节点结构和 HashMap 区别？为什么多这两个指针？**

HashMap 的 Node 节点只有 hash、key、value、next 单向指针；而 LinkedHashMap 的 Entry 节点额外新增 **before、after** 两个双向指针。之所以新增，是因为需要通过这两个指针串联所有元素，构建全局双向链表，实现顺序记录、节点移位、头尾定位等有序核心功能。

## 2. LinkedHashMap 有序性两种模式？为什么能切换模式？

集合的有序模式完全由全局常量**accessOrder** 控制，这是 LinkedHashMap 预留的模式切换开关，本质是通过布尔值判断是否执行「节点移位逻辑」，从而实现两种有序模式的切换。

- **accessOrder = false（默认）**：插入有序模式，关闭节点自动移位
- **accessOrder = true**：访问有序模式，开启节点自动移位，是 LRU 缓存的核心基础

## 3. 插入有序（默认）特点及底层原理

- 严格按照元素 **首次 put 插入顺序** 排列，新元素永远追加在双向链表尾部。
- **get、访问、修改已有 key 不会改变顺序**，底层原因：accessOrder 为 false 时，源码会直接跳过 afterNodeAccess() 移位逻辑，无论元素是否被访问，链表指针都不会变动，顺序永久固定为插入顺序。

## 4. 访问有序（accessOrder=true）特点及底层原理（重点）

开启该模式后，所有触发元素访问、修改的操作，都会执行节点移位逻辑，核心原理是**动态维护链表头尾状态**：

- 每次 **get 查询、put 覆盖旧值** 都会触发 afterNodeAccess 方法，这是源码强制逻辑，只要访问元素即判定为「活跃数据」。
- 被访问的元素会从原有链表位置摘除，重新插入到**双向链表尾部**，标记为最新活跃数据。
- 长期未被访问的元素，始终不会触发移位，会逐步留在链表头部，因此 **链表头部 = 最久未使用元素**。
- 所有最新访问、新增的元素都在尾部，因此 **链表尾部 = 最近刚刚使用元素**。

**追问：put 一个已存在的 key 会不会改变顺序？为什么？**

会改变顺序。底层原理：HashMap 的 putVal 方法中，若匹配到已存在的 key，会在更新 value 后强制回调 afterNodeAccess() 钩子方法；当 accessOrder=true 时，该方法会执行节点移位，将当前元素移至队尾，因此覆盖修改操作等同于访问操作，会改变链表顺序。

# 二、源码层：accessOrder 底层原理（深挖设计逻辑）

## 1. accessOrder 源码定义与设计原因

accessOrder 是 **final 布尔常量**，仅能通过构造方法赋值，初始化后全局不可修改。

**设计原因**：将两种有序模式硬编码固化，避免运行中动态修改模式导致链表顺序混乱、线程数据不一致，同时作为全局开关，精准控制所有访问操作的后续逻辑，实现模式解耦。

## 2. get() 核心源码逻辑及判断原理

LinkedHashMap 重写了 HashMap 的 get 方法，核心是**先查询、后判断、按需移位**：

第一步：通过哈希表查询目标节点，查询为空直接返回 null；第二步：判断 accessOrder 状态，**accessOrder=true** 时，主动调用 afterNodeAccess() 将节点移到尾部，更新元素活跃度。

若 **accessOrder=false**，直接跳过移位逻辑，仅返回 value，最大程度提升默认模式下的查询性能，避免无意义的链表指针操作。

## 3. 三大钩子方法（核心原理+设计意义）

三个方法均是 HashMap 预留的**空实现钩子方法**，HashMap 本身不做任何逻辑，专门留给子类拓展。LinkedHashMap 重写这三个方法，实现有序性和淘汰逻辑，这是典型的模板方法设计模式。

- **afterNodeAccess（访问后钩子）**：元素被查询、修改后触发。原理：重新调整双向链表指针，将活跃节点移至尾部，更新元素访问时间权重，是 LRU 活跃度更新的核心。
- **afterNodeInsertion（插入后钩子）**：新元素插入后触发。原理：判断 removeEldestEntry 的返回值，若为 true，自动删除链表头部最久未使用节点，实现缓存自动淘汰。
- **afterNodeRemoval（删除后钩子）**：元素被删除后触发。原理：修正双向链表的前后指针，填补删除节点的空位，避免链表断裂、指针悬空，保证链表结构完整性。

**追问：为什么 HashMap 没有顺序？**

HashMap 仅存在哈希表结构，无全局双向链表，所有元素分散在哈希表的数组、链表、红黑树中，没有统一的顺序记录载体。遍历 HashMap 是逐一遍历数组所有下标（包含空桶），遍历顺序由哈希值和数组下标决定，完全无序。

**追问：LinkedHashMap 遍历为什么比 HashMap 快？**

HashMap 遍历需要迭代整个哈希表数组，包含大量空桶、无效下标，存在无效遍历损耗；而 LinkedHashMap 遍历直接迭代全局双向链表，**仅遍历所有有效元素**，跳过所有空桶和无效节点，元素越多，遍历效率优势越明显。

# 三、LRU 完整原理（底层逻辑+执行闭环）

## 1. LRU 定义与设计思想

**LRU（Least Recently Used）最近最少使用淘汰策略**

核心设计思想：**数据的访问频次决定留存优先级**，程序热点数据大概率是近期频繁访问的数据，长期未访问的数据大概率是无用冷数据。因此缓存容量不足时，优先淘汰最久未访问的数据，最大化缓存命中率。

## 2. LinkedHashMap 实现 LRU 的**三个必要条件及原理**（必背）

1. **构造方法开启 accessOrder = true**：开启访问有序模式，让所有读写操作自动更新元素位置，实现活跃度动态排序，这是 LRU 的基础前提。
2. **重写 removeEldestEntry() 方法**：该方法默认返回 false（不淘汰元素），重写后自定义容量阈值，告知容器「容量超限需要淘汰数据」，是 LRU 淘汰的触发开关。
3. **自动删除链表头部节点**：基于 accessOrder 机制，头部固定为最久未使用元素，淘汰头部节点，精准匹配 LRU「淘汰最少使用数据」的核心规则。

## 3. LRU 完整执行流程及底层原理（面试官最爱问）

- **新数据插入**：新元素默认追加到双向链表尾部，标记为最新活跃数据，符合「新数据优先级留存」逻辑。
- **访问旧数据**：触发 afterNodeAccess 移位，将旧数据挪到链表尾部，更新为最新活跃数据，避免热点数据被误淘汰。
- **缓存容量满**：插入新数据后触发 afterNodeInsertion，判定容量超限，删除链表头部最久未使用的冷数据，完成自动淘汰。

## 4. 可直接面试默写的 LRU 代码（含原理注释）

```java
public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    // 自定义缓存最大容量
    private final int capacity;

    public LRUCache(int capacity) {
        // 第三个参数true：开启访问有序模式（LRU核心开关）
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    // 重写淘汰规则：核心判断逻辑
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // 当当前元素数量超过最大容量，返回true，触发头部节点淘汰
        return size() > capacity;
    }
}
```

# 四、高频连环追问（拔高+深度原理答案）

## 追问1：accessOrder=true 时，put 相同 key 顺序变吗？为什么？

**结论：会变**

**底层原理**：HashMap 核心 putVal 方法中，若 key 已存在，更新 value 后会固定回调 afterNodeAccess 钩子方法。在 accessOrder=true 模式下，该方法会执行链表节点移位操作，将当前更新的元素移至队尾。本质是源码将「更新操作」等价于「访问操作」，更新即刷新活跃度。

## 追问2：LinkedHashMap 线程不安全的底层原因？

**底层原理**：所有读写、移位、淘汰操作均无锁，多线程并发场景下会出现线程安全问题。多线程同时 put 可能导致哈希表数据覆盖、链表闭环；同时 accessOrder 模式下的节点移位操作是非原子操作，多线程并发会导致双向链表指针错乱，出现数据丢失、死循环问题。

## 追问3：为什么不直接用 HashMap 做缓存？

**核心原因**：HashMap 无序，无任何机制记录元素的访问时间、活跃度，无法区分冷热数据。而缓存淘汰的核心是识别「最久未使用数据」，HashMap 不具备排序和活跃度更新能力，完全无法实现 LRU 淘汰策略。

## 追问4：LinkedHashMap 原生 LRU 有什么缺点？原理是什么？

- **线程不安全**：无并发锁控制，不适合高并发缓存场景。
- **存在缓存污染问题（核心缺陷）**：原理是原生 LRU 仅依据「访问时间」排序，无访问频次判断。偶尔访问一次的冷门数据，会直接挪到队尾，挤占长期高频访问的热点数据，导致热点数据被误淘汰，降低缓存命中率。
- **一次性扫描淘汰大量热点（极端缺陷）**：批量遍历大量冷数据时，所有冷数据都会刷新到队尾，直接挤掉全部热点数据，造成缓存雪崩式失效。

**进阶追问：如何解决原生 LRU 缓存污染缺陷？（面试拔高必答）**

原生 LRU 只看「时间」不看「频次」，优化方案核心思路：**区分偶然访问和高频访问，过滤冷数据污染**，主流三种工业级方案：

- **LRU-K（经典优化）**：不直接将首次访问数据加入缓存，需要访问 K 次才认定为热点数据，有效过滤一次性冷门访问数据，解决缓存污染，生产常用 LRU-2、LRU-3。
- **2Q 算法（平衡性能）**：将缓存分为两个队列（临时队列+热点队列），新数据先入临时队列，多次访问才升级到热点队列，兼顾效率和防污染，开销低于 LRU-K。
- **LFU 算法（频次优先）**：基于访问频次淘汰，优先删除访问次数最少的数据，彻底解决偶然访问数据挤占热点的问题；缺点是需要维护计数，内存开销稍大。

## 追问5：LinkedHashMap 和 TreeMap 核心区别（底层原理差异）

- **TreeMap**：底层纯红黑树，基于 key 的自然排序/自定义Comparator排序，属于**主动排序**，每次增删都要重构红黑树，效率低，适用于需要全局有序排序的场景。
- **LinkedHashMap**：底层哈希表+双向链表，基于插入/访问顺序排序，属于**被动记录顺序**，不改变哈希高效存取的特性，读写性能接近 HashMap，仅适用于记录访问、插入顺序和缓存场景。

## 追问6：双向链表头尾节点的核心作用？为什么需要头尾指针？

- **head 头节点**：永久存储最久未使用的冷数据，是 LRU 唯一的淘汰节点来源，无需遍历链表即可直接定位淘汰元素，保证淘汰效率 O(1)。
- **tail 尾节点**：永久存储最新访问的热数据，所有新增、访问后的元素均存入尾部，快速标记活跃数据。

**设计原理**：头尾指针让 LRU 排序、淘汰、更新操作无需遍历链表，所有操作均为 O(1) 时间复杂度，保证缓存高性能。

# 五、终极面试极简背诵版（原理+结论双版本）

**1. LinkedHashMap 结构及原理**：复用 HashMap 哈希表实现 O(1) 高效存取，新增全局双向链表专门记录元素顺序，兼顾性能与有序性。

**2. 有序两种模式及原理**：accessOrder=false（默认）关闭移位，实现插入有序；accessOrder=true 开启移位，实现访问有序，为 LRU 提供基础。

**3. accessOrder=true 核心行为原理**：get、put 更新操作都会触发 afterNodeAccess，刷新元素位置到队尾，动态区分冷热数据。

**4. LRU 核心原理闭环**：accessOrder 动态排序冷热数据，头部存冷数据、尾部存热数据，容量超限自动删除头部最久未使用元素。

**5. 三大钩子方法原理**：访问移位更新活跃度、插入判断淘汰数据、删除维护链表结构，是 LinkedHashMap 有序和 LRU 淘汰的核心支撑。

### LinkedhashMap.get()方法源码。

```java
public V get(Object key) {
    Node<K,V> e;
    if ((e = getNode(key)) == null)
        return null;
    if (accessOrder)
        afterNodeAccess(e);
    return e.value;
}
```

### afterNodeAccess()方法源码

```java
void afterNodeAccess(Node<K,V> e) {
    LinkedHashMap.Entry<K,V> last;
    LinkedHashMap.Entry<K,V> first;
    if ((putMode == PUT_LAST || (putMode == PUT_NORM && accessOrder)) && (last = tail) != e) {
        // move node to last
        LinkedHashMap.Entry<K,V> p =
            (LinkedHashMap.Entry<K,V>)e, b = p.before, a = p.after;
        p.after = null;
        if (b == null)
            head = a;
        else
            b.after = a;
        if (a != null)
            a.before = b;
        else
            last = b;
        if (last == null)
            head = p;
        else {
            p.before = last;
            last.after = p;
        }
        tail = p;
        ++modCount;
    } else if (putMode == PUT_FIRST && (first = head) != e) {
        // move node to first
        LinkedHashMap.Entry<K,V> p =
            (LinkedHashMap.Entry<K,V>)e, b = p.before, a = p.after;
        p.before = null;
        if (a == null)
            tail = b;
        else
            a.before = b;
        if (b != null)
            b.after = a;
        else
            first = a;
        if (first == null)
            tail = p;
        else {
            p.after = first;
            first.before = p;
        }
        head = p;
        ++modCount;
    }
}
```

### put()方法

```java
public V put(K key, V value) {
    return putVal(hash(key), key, value, false, true);
}
```

### hash（）方法源码

```java
static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```

### putval()方法源码

```java
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
    Node<K,V>[] tab; Node<K,V> p; int n, i;
    if ((tab = table) == null || (n = tab.length) == 0)
        n = (tab = resize()).length;
    if ((p = tab[i = (n - 1) & hash]) == null)
        tab[i] = newNode(hash, key, value, null);
    else {
        Node<K,V> e; K k;
        if (p.hash == hash &&
            ((k = p.key) == key || (key != null && key.equals(k))))
            e = p;
        else if (p instanceof TreeNode)
            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
        else {
            for (int binCount = 0; ; ++binCount) {
                if ((e = p.next) == null) {
                    p.next = newNode(hash, key, value, null);
                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                        treeifyBin(tab, hash);
                    break;
                }
                if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                    break;
                p = e;
            }
        }
        if (e != null) { // existing mapping for key
            V oldValue = e.value;
            if (!onlyIfAbsent || oldValue == null)
                e.value = value;
            afterNodeAccess(e);
            return oldValue;
        }
    }
    ++modCount;
    if (++size > threshold)
        resize();
    afterNodeInsertion(evict);
    return null;
}
```
