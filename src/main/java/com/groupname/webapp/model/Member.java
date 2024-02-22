package com.groupname.webapp.model;

public class Member {
    private String name;
    private String role;

    // Constructor
    public Member(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for role
    public String getRole() {
        return role;
    }

    // Setter for role
    public void setRole(String role) {
        this.role = role;
    }
}
