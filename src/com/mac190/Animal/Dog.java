package com.mac190.Animal;

/*
Derive a class Dog from class Animal knowing that a Dog is of Canine species
omnivor diet and in addition it has breed.
appropriate setters/getters and constructors
override the speak method to display "Waf Waf!"
 */
public class Dog extends Animal {
    protected String breed;
    public Dog() {
        super();
        setSpecies("Canine");
        setDiet("omnivore");
        setBreed("N/A");
    }


    public Dog(String color, int age, String breed) {
        this();
        setColor(color);
        setAge(age);
        setBreed(breed);
    }

    @Override
    public void speak() {
        System.out.println("Waf Waf!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
