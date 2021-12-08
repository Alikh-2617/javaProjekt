package com.company;

public class Main {

    public static void main(String[] args) {

        Person man = new Male(2000 );
        Person woman = new Woman(2500 );
        Woman woman1 = new Woman(2500 , "Blue");


        Food broccoli = new Broccoli();
        Food slicePizza = new Pizza();
        Food sandwich = new Sandwich();
        Sporting run = new Running();
        Sporting walking = new Walking();
        Sporting swimming = new Swimming();

        man.eat(slicePizza);
        man.eat(sandwich);
//        man.eat(sandwich);
//        man.eat(broccoli);



        woman.eat(broccoli);
        woman.eat(sandwich);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman.eat(slicePizza);
        woman1.setColor("ble");                                      //bara woman1 kan har funktion get/set color !! inte i person class




        System.out.print("Calories status for a Man in day ==>  ");
        man.printGetCalories();
        System.out.print("Calories Got ==>  ");
        man.printCalories();
        System.out.println("person is food ==> "+man.isMeet());
        man.sport(run ,10);
        man.sport(walking , 5);
        man.sport(swimming,5);

        System.out.print("Calories after Sporting ==> ");
        man.printCalories();
        System.out.println("person is food ==> "+man.isMeet());
        System.out.println("person eating enough before sporting ==> "+man.equals(man));

        System.out.println("------------------------------------------");
        System.out.print("Calories status for a Woman in day ==> ");
        woman.printGetCalories();
        System.out.print("Calories got ==>  ");
        woman.printCalories();
        System.out.println("person is food ==> " + woman.isMeet());

        woman.sport(run,5);
        woman.sport(walking,2 );
    //    woman.sport(swimming , 2 );

        System.out.println(woman1.getColor());                   //Bara woman1 kan har getColor funktion !!

        System.out.print("Calories after Sporting ==> ");
        woman.printCalories();
        System.out.println("person is food ==> "+ woman.isMeet());
        System.out.println("person eating enough before sporting ==> "+woman.equals(woman));


    }
}
