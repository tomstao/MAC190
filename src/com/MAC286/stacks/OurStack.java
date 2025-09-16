package com.MAC286.stacks;

import java.util.EmptyStackException;
import java.util.Random;

/*
Stack is a data structure in which when you add something
to store it get to the top of the stack and when you ermove the top comes out first

LIFO: last in first out
The standard interface for a stack is the following:
- A default constructore
- Size()
 returns the number of the lements in the stack
 - isEmpty() return trues if stack is empty, false if not
 _ vod push(T e) adds e to the top of the stack
 - T pop() removes the top of the stack in the stack
 - T peel() returns the top the stack without removing it
 - toString
  */
public class OurStack<T> {
    private T[] array;
    private int size;
    private int Increment;

    //Default constructor
    public OurStack(){
        array = (T[]) new Object[10];
        size = 0;
        Increment = 10;
    }
    public OurStack(int c){
        array = (T[]) new Object[c];
        size = 0;
        Increment = 10;
    }
    public OurStack(int c, int incr){
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

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        T save = array[this.size - 1];
        array[this.size - 1] = null;
        size--;
        return save;
    }

    public T peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }  else{
            return array[0];
        }
    }

    public void push(T item){
        if(size == array.length){
            resize();
        }

        this.add(0,item);
    }
}
