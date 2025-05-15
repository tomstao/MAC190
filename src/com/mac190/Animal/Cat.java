package com.mac190.Animal;
/*
Derive a class Cat from Animal knowing that a cat is of Cat species
and carnivore diet and in addition it has breed.
appropriate setters/getters and constructors
The method speak should display "Miaw Miaw"
 */
public class Cat extends Animal {
    String breed;
    public Cat() {
        super();
        setSpecies("Cat");
        setDiet("Carnival");
        setBreed("N/A");
    }

    public Cat(String color, int age, String breed) {
        this();
        setColor(color);
        setAge(age);
        setBreed(breed);
    }

    @Override
    public void speak() {
        System.out.println("Miaw Miaw");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
