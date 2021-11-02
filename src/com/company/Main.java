package com.company;

public class Main {

    public static void main(String[] args) {

        Male man = new Male(2000 );
        Woman woman = new Woman(2500 );

        Food broccoli = new Broccoli();
        Food slicePizza = new Pizza();
        Food sandwich = new Sandwich();
        Sporting run = new Running();
        Sporting walking = new Walking();
        Sporting swimming = new Swimming();

        man.eat(slicePizza);
        man.eat(sandwich);
        man.eat(sandwich);
        man.eat(broccoli);



        woman.eat(broccoli);
        woman.eat(sandwich);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);




        System.out.print("Calories status for Man in day ==>  ");
        man.printGetCalories();
        System.out.print("Calories Got in the day ==>  ");
        man.printCalories();
        System.out.println("person is Saturation? ==> "+man.isMeet());

        man.sport(run ,10);
        man.sport(walking , 5);
        man.sport(swimming,5);

        System.out.print("After Sporting ==> ");
        man.printCalories();
        System.out.println("person is Saturation? ==> "+man.isMeet());

        System.out.println("------------------------------------------");
        System.out.print("Calories status for Woman in day ==> ");
        woman.printGetCalories();
        System.out.print("Calories Got in the day ==>  ");
        woman.printCalories();
        System.out.println("person is Saturation? => " + woman.isMeet());

        woman.sport(run,5);
        woman.sport(walking,2 );
    //    woman.sport(swimming , 2 );

        System.out.print("After Sporting ==> ");
        woman.printCalories();
        System.out.println("person is Saturation? => "+ woman.isMeet());


    }
}
