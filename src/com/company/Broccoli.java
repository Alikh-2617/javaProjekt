package com.company;

public class Broccoli implements Food {
    private int caloriesNumber = 50 ;

    public Broccoli () {

    }

    @Override
    public int getCaloriesNumber() {
        return caloriesNumber;
    }
}
