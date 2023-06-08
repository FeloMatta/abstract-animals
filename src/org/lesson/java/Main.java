package org.lesson.java;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[4];

        zoo[0] = new Dog();
        zoo[1] = new Dolphin();
        zoo[2] = new Eagle();
        zoo[3] = new Sparrow();

        for (int i = 0; i < zoo.length; i++){
            System.out.println("--- Animal " + (i + 1) + " ---");
            System.out.println("Name: " + zoo[i].getClass().getSimpleName());
            System.out.print("Noise: ");
            zoo[i].noise();
            System.out.print("Eats: ");
            zoo[i].eat();
            System.out.print("Sleep");
            zoo[i].sleep();
        }
    }
}
