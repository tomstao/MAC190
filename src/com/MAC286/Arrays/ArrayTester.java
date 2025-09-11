package com.MAC286.Arrays;

public class ArrayTester {
    public static void main(String[] args) {

        Arrays arr = new Arrays();


        for (int i = 0; i < arr.getArray().length; i++) {
            arr.getArray()[i] = i;
            arr.setSize(arr.getSize() + 1);
        }

        System.out.println(arr);
        System.out.println( "Removed value: " + arr.remove());
        System.out.println("-".repeat(30));
        System.out.println(arr);

    }
}
