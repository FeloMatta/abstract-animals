package org.lesson.java;

public class Dog extends Animal{
    @Override
    public void noise() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("kibble");
    }
}
