package com.MAC286.Arrays;//Design a class OurArray that has the following properties.
//1- A reference to an array of integers
// 2- an integer to keep track of the size of the array
// 3- default constructor that creates an array of 10 integers and sets size to 0
//3- A constructor that accepts the intial capacity. Create an array of that specific capacity and set size to 0
// 4- Method void add(int item) adds item to the back of the array. Assign item to index size and increase size by 1
// 5- toString returns content of the arrayin the form [-2, -5] 

class Arrays {
    private final int[] array;
    private int size;

    public Arrays() {
        array = new int[10];
        this.size = 0;
    }

    public Arrays(int size) {
        array = new int[size];
        this.size = 0;
    }

    public void add(int item) {
        if (size < array.length) {
            array[size++] = item;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return array.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

class main{
    public static void main(String[] args) {
        Arrays arrays = new Arrays(5);
        System.out.println(arrays);

    }
}

