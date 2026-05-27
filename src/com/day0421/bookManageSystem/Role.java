package com.day0421.bookManageSystem;

public class Role {
    // 角色名称，比如 "管理员" 或 "普通用户"
    private String roleName;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
