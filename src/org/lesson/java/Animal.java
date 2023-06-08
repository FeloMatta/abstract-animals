package org.lesson.java;

public abstract class Animal {
    public void sleep(){
        System.out.println("Zzz");
    }

    public void printAnimal(){
        System.out.println("Animal: " + this.getClass().getSimpleName());
        System.out.print("Noise: ");
        noise();
        System.out.print("Eat: ");
        eat();
        System.out.println("Sleep");
        sleep();
    }

    public abstract void noise();
    public abstract void eat();

}
