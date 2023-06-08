package org.lesson.java;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void noise() {
        System.out.println("eeeeeeeee tehehehehe eep");
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm Swimming!!!");
    }
}
