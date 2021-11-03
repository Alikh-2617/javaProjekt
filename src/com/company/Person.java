package com.company;

public class Person {
    protected int needCalories ;
    private int currentCalories;



    public Person(int needCalories ){
        this.needCalories = needCalories;

    }
    public void printColor (String color ){
        System.out.println(color);
    }

    public boolean isMeet(){
        return  currentCalories >= needCalories;
    }

    public void eat(Food i ){
        currentCalories += i.getCaloriesNumber();
    }
    public void sport (Sporting p , int minutes ){currentCalories += minutes*p.getBurnsCalories();}

    public void printGetCalories (){
        System.out.println( needCalories);
    }
    public void printCalories(){
        System.out.println(currentCalories );
    }

    public boolean equals (Person i ){
        if (i.needCalories == this.needCalories ){
            return true ;
        }
        else {
            return false;
        }

    }
}
