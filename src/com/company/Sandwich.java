package com.company;

public class Sandwich implements Food {
    private int caloriesNumber = 800;

    public Sandwich(){

    }

    @Override
    public int getCaloriesNumber() {
        return caloriesNumber;
    }
}
