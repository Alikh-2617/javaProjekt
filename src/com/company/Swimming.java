package com.company;

public class Swimming implements Sporting {
    private int burnsCalories = -30;
    private int minutes = 0;
    @Override
    public int getBurnsCalories() {
        return burnsCalories;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }
}
