package com.example.coloractivity;

import android.graphics.Color;

public class ColorItem {
    private String colorName;
    private int colorDisplay;

    public ColorItem(String colorName, int colorDisplay) {
        this.colorName = colorName;
        this.colorDisplay = colorDisplay;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorDisplay() {
        return colorDisplay;
    }
}