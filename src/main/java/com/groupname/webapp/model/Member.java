package com.groupname.webapp.model;

public class Member {
    private String name;
    private String role;
    private String imageFilename; // Added property for the image filename

    // Constructor including the imageFilename
    public Member(String name, String role, String imageFilename) {
        this.name = name;
        this.role = role;
        this.imageFilename = imageFilename;
    }

    // Getters and setters for all properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }
}
