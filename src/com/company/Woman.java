package com.company;

public class Woman extends Person {
    private String color ;

    public Woman(int needCalories) {
        super(needCalories);
    }
    public Woman (int needCalories , String color){
        super(needCalories);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
