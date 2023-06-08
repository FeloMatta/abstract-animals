package org.lesson.java;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[4];

        zoo[0] = new Dog();
        zoo[1] = new Dolphin();
        zoo[2] = new Eagle();
        zoo[3] = new Sparrow();

        System.out.println("--- Print all animals ---");


        for (int i = 0; i < zoo.length; i++){
            System.out.println("--- Animal " + (i + 1) + " ---");
            zoo[i].printAnimal();
        }

        CanFly[] fly = new CanFly[2];
        fly[0] = new Eagle();
        fly[1] = new Sparrow();
        System.out.println("Print flying animals");

        for (int i = 0; i < fly.length; i++){
            System.out.println("--- Animal " + (i + 1) + " ---");
            if (fly[i] instanceof Animal){
                ((Animal) fly[i]).printAnimal();
            }
            System.out.print("Fly: ");
            fly[i].Fly();
        }


        CanSwim[] swim = new CanSwim[2];
        swim[0] = new Dog();
        swim[1] = new Dolphin();
        System.out.println("Print swimming animals");
        for (int i = 0; i < swim.length; i++){
            System.out.println("--- Animal " + (i + 1) + " ---");
            if (swim[i] instanceof Animal){
                ((Animal) swim[i]).printAnimal();
            }
            System.out.print("Swim: ");
            swim[i].swim();
        }

        System.out.println("--- Flys or swims? ---");
        for (int i = 0; i < zoo.length; i++){
            System.out.println("--- Animal " + (i + 1) + " ---");
            System.out.println("Animal: " + zoo[i].getClass().getSimpleName());
            if (zoo[i] instanceof CanFly){
                System.out.print("Fly: ");
                makeFly((CanFly)zoo[i]);
            }
            if (zoo[i] instanceof CanSwim ){
                System.out.print("Swim: ");
                makeSwim((CanSwim) zoo[i]);
            }
        }

    }

    public static void makeFly(CanFly animal){
        animal.Fly();
    }
    public static void makeSwim(CanSwim animal){
        animal.swim();
    }
}
