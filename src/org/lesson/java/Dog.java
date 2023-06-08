package org.lesson.java;

public class Dog extends Animal implements CanSwim{
    @Override
    public void noise() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("kibble");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming!!!");
    }
}
