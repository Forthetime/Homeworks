package ru.otus.java.homework_generics;

public class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange{" + "weight=" + getWeight() + '}';
    }
}