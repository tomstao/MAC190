package com.MAC286.Arrays;// Use this editor to write, compile and run your Java code online

// Use this editor to write, compile and run your Java code online
//Design a class OurArray that has the following properties. 
//1- A reference to an array of integers
// 2- an integer to keep track of the size of the array
// 3- default constructor that creates an array of 10 integers and sets size to 0
//3- A constructor that accepts the intial capacity. Create an array of that specific capacity and set size to 0
// 4- Method void add(int item) adds item to the back of the array. Assign item to index size and increase size by 1
// 5- toString returns content of the arrayin the form [-2, -5] 

class Arrays{
    private int[] array;
    private int size;

    //Default constructor 
    public Arrays(){
        array = new int[10];
        size = 0;
    }
    public Arrays(int c){
        array = new int[c];
        size = 0;
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
    public void add(int item){
        //check if full 
        if(size == array.length){
            System.out.println("Array full cannot add");
            return;
            //resize()
        }
        //add the item at index size 
        array[size] = item;
        //increment the size 
        size++;
    }
    public void add(int ind, int item){
        //check if ind in a valid index
        if(ind < 0 || ind > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(size == array.length){
            System.out.println("Cannot add it's full");
            return;
        }
        //shift up all items starting from size-1 down to ind
        for(int i = size - 1; i >= ind; i--){
            array[i+1] = array[i];
        }
        array[ind] = item;
        size++;

    }
    //HW1 complete the remove method that removes the top of the array and returns it. Test it
    public int remove(){
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException();
        } else if(size == 1){
            return array[0];
        }
        int item = array[0];
        for (int i = 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        return item;
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

    public static void main(String[] args){

        //create an object OurArray
        Arrays A = new Arrays(5);
        System.out.println("A: " + A);
        A.add(-2);
        A.add(-5);
        A.add(-7);
        System.out.println("A: " + A);
        A.add(1, -9);
        System.out.println("A: " + A);
    }
}