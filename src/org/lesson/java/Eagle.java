package org.lesson.java;

public class Eagle extends Animal implements CanFly{

    @Override
    public void noise() {
        System.out.println("Craa");
    }

    @Override
    public void eat() {
        System.out.println("Small mammals");
    }

    @Override
    public void Fly() {
        System.out.println("I'm flying!!!");
    }
}
