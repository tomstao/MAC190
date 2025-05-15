package com.mac190.Animal;
/*
Derive a class Cat from Animal knowing that a cat is of Cat species
and carnivore diet and in addition it has breed.
appropriate setters/getters and constructors
The method speak should display "Miaw Miaw"
 */
public class Cat extends Animal {
    public Cat() {
        super();
        setSpecies("Cat");
        setDiet("Carnival");
    }

    public Cat(String color, int age) {
        this();
        setColor(color);
        setAge(age);
    }

    @Override
    public void speak() {
        System.out.println("Miaw Miaw");
    }
}
