package com.example.createTag.model;

public class TagesDetails {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImageCount() {
        return imageCount;
    }

    public void setImageCount(int imageCount) {
        this.imageCount = imageCount;
    }

    private String id;

    public TagesDetails(String id, String name, String description, String type, int imageCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.imageCount = imageCount;
    }

    private String name;
    private String description;
    private String type;
    private int imageCount;
}