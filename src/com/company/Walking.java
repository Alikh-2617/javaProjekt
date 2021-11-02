package com.company;

public class Walking implements Sporting {
    private int burnsCalories = -10;
    private int minutes;
    @Override
    public int getBurnsCalories() {
        return burnsCalories;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }
}
