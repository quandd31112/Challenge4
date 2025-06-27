package com.example.challenge4;

public class Sport {
    private final String name;
    private final int imageResId;

    public Sport(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
