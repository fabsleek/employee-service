package com.example.demo.entity;

public enum Department {

    FINANCE("Finance"), HR("Human Resource"), DEVELOPERS("Developer");

    private String department;
    Department (String department){
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

