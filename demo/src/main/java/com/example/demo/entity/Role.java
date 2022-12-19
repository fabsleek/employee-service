package com.example.demo.entity;

public enum Role  {

    ADMIN("Admin"), USER("User "), DEVELOPERS("Developer");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String department) {
        this.role = role;
    }

}
