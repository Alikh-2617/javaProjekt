package com.company;

public class Pizza implements Food {
    private int caloriesNumber = 350 ;

    public Pizza (){

    }

    @Override
    public int getCaloriesNumber() {
        return caloriesNumber;
    }
}
