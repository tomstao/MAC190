package com.mac190.Animal;

/*
Derive a class Dog from class Animal knowing that a Dog is of Canine species
omnivor diet and in addition it has breed.
appropriate setters/getters and constructors
override the speak method to display "Waf Waf!"
 */
public class Dog extends Animal {

    public Dog() {
        super();
        setSpecies("Canine");
        setDiet("omnivore");
    }


    public Dog(String color, int age) {
        this();
        setColor(color);
        setAge(age);
    }

    @Override
    public void speak() {
        System.out.println("Waf Waf!");
    }
}
