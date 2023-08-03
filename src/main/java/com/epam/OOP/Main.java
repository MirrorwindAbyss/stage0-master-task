package com.epam.OOP;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("pink", 2, false);
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
