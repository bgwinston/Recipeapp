package com.projects.Recipe.models;

public class recipes {
    private String name;
    private String description;
    private String category;
    private String rating;
    private String fullrecipe;

    public recipes(String name, String description, String category, String rating) {
        this.name=name;
        this.description=description;
        this.category=category;
        this.rating=rating;
        this.fullrecipe=fullrecipe;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFullrecipe() {
        return fullrecipe;
    }

    public void setFullrecipe(String fullrecipe) {
        this.fullrecipe = fullrecipe;
    }
}