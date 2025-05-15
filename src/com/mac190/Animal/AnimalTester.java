package com.mac190.Animal;

public class AnimalTester {
    public static void main(String[] args) {
        // created an object Animal that is a Dog, age 3, color gray
        Animal animal = new Animal("Canine", "Omnival", "Gray", 3);
        System.out.println(animal);
        Dog dog = new Dog("Gray", 3, "Chiwawa");
        System.out.println(dog);
        Cat cat = new Cat("Gray", 3, "Ciamoi");
        System.out.println(cat);


        Cat c1 = (Cat) animal;
        System.out.println(c1);

    }
}
