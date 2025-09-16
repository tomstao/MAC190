package com.MAC286.Vector;

// Use this editor to write, compile and run your Java code online

// Use this editor to write, compile and run your Java code online
//Design a class OurArray that has the following properties.
//1- A reference to an array of integers
// 2- an integer to keep track of the size of the array
// 3- default constructor that creates an array of 10 integers and sets size to 0
//3- A constructor that accepts the intial capacity. Create an array of that specific capacity and set size to 0
// 4- Method void add(int item) adds item to the back of the array. Assign item to index size and increase size by 1
// 5- toString returns content of the arrayin the form [-2, -5]

import java.util.EmptyStackException;
import java.util.Random;

class OurArray <T>{
    private T[] array;
    private int size;
    private int Increment;

    //Default constructor
    public OurArray(){
        array = (T[]) new Object[10];
        size = 0;
        Increment = 10;
    }
    public OurArray(int c){
        array = (T[]) new Object[c];
        size = 0;
        Increment = 10;
    }
    public OurArray(int c, int incr){
        array = (T[]) new Object[c];;
        size = 0;
        Increment = incr;
    }
    //getter for size
    public int size(){
        return size;
    }
    //getter for capacity
    public int capacity(){
        return array.length;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public T get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
    private void resize(){
        //create an array of length, old array's length
        //augmented by increment
        T[] newArray = (T[]) new Object[array.length + Increment];
        //copy all elements of old array into new array
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        //rename new array to old array
        array = newArray;
    }
    public void add(T item){
        //check if full
        if(size == array.length){
            resize();
        }
        //add the item at index size
        array[size] = item;
        //increment the size
        size++;
    }
    public void add(int ind, T item){
        //check if ind in a valid index
        if(ind < 0 || ind > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(size == array.length){
            resize();
        }
        //shift up all items starting from size-1 down to ind
        for(int i = size - 1; i >= ind; i--){
            array[i+1] = array[i];
        }
        array[ind] = item;
        size++;

    }
    //HW1 complete the remove method that removes the top of the array and returns it. Test it
    public T remove(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        T save = array[size-1];
        size--;
        return save;
    }
    public T remove(int ind){
        //if empty throw an exception
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        //if invalid index, throw IndexOutOfBoundsException
        if(ind < 0 || ind >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        //save element at ind
        T save = array[ind];
        //push all elements down by one starting at ind
        //up until size-1
        for(int i = ind; i < size-1; i++){
            array[i] = array[i+1];
        }
        //return the saved data.
        size--;
        return save;
    }
    /*
    public String toString(){
        if(this.isEmpty()){
            return "[]";
        }
        String str = "[";
        for(int i = 0; i < size-1; i++){
            str += array[i] + ", ";
        }
        str += array[size-1]+"]";

        //One solution not advisable
        //str = str.replace(", ]", "]");
        return str;
    }
    */
    //Another way of dealing with the comma problem
    public String toString(){
        if(this.isEmpty()){
            return "[]";
        }
        String str = "[" + array[0];
        for(int i =1; i < size; i++){
            str += ", "+ array[i];
        }
        str += "]";

        //One solution not advisable
        //str = str.replace(", ]", "]");
        return str;
    }

    //this method returns a random number between -max and +max
    public static int getRandom(int max){
        Random generator = new Random();
        return generator.nextInt(-max, max + 1);
    }
    public static void main(String[] args) {
        /*
        1- Create an OurArray object of Integers
        2- fill it with 20 random numbers generated using the method above
        3- Using another OurArray object, sort the previous array so that
        negative numbers go first then positive numbers, while the order
        in which they were originally is respected.
        Example:
        [2, -4, 5, 6, -7, 8, -9, -1] The result should be
        [-4, -7, -9, -1, 2, 5, 6, 8].
        Use only one loop.
         */

        OurArray<Integer> original = new OurArray<>();

        for(int i = 0; i < 20; i++){
            original.add(getRandom(50));
        }
        System.out.println("Original array: " + original);

        OurArray<Integer> negatives = new OurArray<>();
        OurArray<Integer> positives = new OurArray<>();

        // Single loop to separate negatives and positives
        for(int i = 0; i < original.size(); i++){
            int value = original.get(i);
            if(value < 0){
                negatives.add(value);
            } else {
                positives.add(value);
            }
        }

        // Now combine them (this is just displaying, not looping through original)
        System.out.print("Sorted array (negatives first): [");
        for(int i = 0; i < negatives.size(); i++){
            System.out.print(negatives.get(i));
            if(i < negatives.size() - 1 || positives.size() > 0){
                System.out.print(", ");
            }
        }
        for(int i = 0; i < positives.size(); i++){
            System.out.print(positives.get(i));
            if(i < positives.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}