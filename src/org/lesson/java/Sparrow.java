package org.lesson.java;

public class Sparrow extends Animal{
    @Override
    public void noise() {
        System.out.println("Chip");
    }

    @Override
    public void eat() {
        System.out.println("corn");
    }
}
