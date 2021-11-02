package com.company;

public class Running implements Sporting{
    private int burnsCalories = -20;
    private int minutes = 0;

    public Running (){

    }


    @Override
    public int getBurnsCalories() {
        return burnsCalories;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }
}
