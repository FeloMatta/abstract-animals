package org.lesson.java;

public class Sparrow extends Animal implements CanFly{
    @Override
    public void noise() {
        System.out.println("Chip");
    }

    @Override
    public void eat() {
        System.out.println("corn");
    }

    @Override
    public void Fly() {
        System.out.println("I'm Flying!!!");
    }
}
