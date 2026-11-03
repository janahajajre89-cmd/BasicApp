package com.example.basicapp;

import java.io.Serializable;

public class Clothes implements Serializable {
    private String id;
    private String name;
    private String type;
    private String description;
    private String imageUrl;

    // 1. Constructor فارغ (مهم جداً لـ Firebase لقراءة البيانات)
    public Clothes() {
    }

    // 2. Constructor شامل لإنشاء كائن جديد
    public Clothes(String id, String name, String type, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // 3. Getters و Setters لكل حقل
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
