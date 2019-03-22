package com.example.joseph.gsonexample;

import com.google.gson.annotations.SerializedName;

public class Recipe {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("servings")
    private String servings;

    public Recipe(int id, String name, String servings){
        this.id = id;
        this.name = name;
        this.servings = servings;
    }
}
