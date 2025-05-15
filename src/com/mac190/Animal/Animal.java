package com.mac190.Animal;
//Design a class Animal that has the following:
//species, diet, color, age
//default constructor and a constructor that accepts all info.
// toString
//method speak that displays "I don't know how to speak yet!"
public class Animal {
    protected String species;
    protected String diet;
    protected String color;
    protected int age;

    public Animal(String species, String diet, String color, int age) {
        this.species = species;
        this.diet = diet;
        this.color = color;
        this.age = age;
    }

    public Animal() {
        this("Unknown", "Unknown", "Unknown", 0);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public void speak() {
        System.out.println("I don't know how to speak yet!");
    }
}
