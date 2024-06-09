package com.nayan.volumecalculator;

public class Shape {
    String shape_name;
    int shape_img;

    public Shape(String shape_name, int shape_img) {
        this.shape_name = shape_name;
        this.shape_img = shape_img;
    }

    public String getShape_name() {
        return shape_name;
    }

    public void setShape_name(String shape_name) {
        this.shape_name = shape_name;
    }

    public int getShape_img() {
        return shape_img;
    }

    public void setShape_img(int shape_img) {
        this.shape_img = shape_img;
    }
}


