package org.lesson.java;

public class Eagle extends Animal {

    @Override
    public void noise() {
        System.out.println("Craa");
    }

    @Override
    public void eat() {
        System.out.println("Small mammals");
    }
}
