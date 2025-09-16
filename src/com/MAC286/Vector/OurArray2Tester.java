package com.MAC286.Vector;

public class OurArray2Tester {
    public static void main(String[] args){

        //create an object OurArray
        OurArray<Integer> A = new OurArray<Integer>(5, 10);
        //Vector<Integer> A = new Vector<>(5, 10);
        System.out.println("A: " + A);
        A.add(-2);
        A.add(-5);
        A.add(-7);
        System.out.println("A: " + A);
        A.add(1, -9);
        System.out.println("size: " + A.size() + " Capacity: " + A.capacity() + " A: " + A);
        A.add(-11);
        System.out.println("size: " + A.size() + " Capacity: " + A.capacity() + " A: " + A);
        A.add(-13);
        System.out.println("size: " + A.size() + " Capacity: " + A.capacity() + " A: " + A);
        System.out.println("removing element at 1: " + A.remove(1));
        System.out.println("A: " + A);
        System.out.println("removing element at 0: " + A.remove(0));
        System.out.println("A: " + A);
        //Create an object OurArray of strings.
        //add the following strings to it: hello, hi, bye, how.
        OurArray<String> strArr = new OurArray<>(5,10);
        strArr.add("hello");
        strArr.add("hi");
        strArr.add("bye");
        strArr.add("how");
        //insert hola after hi.
        strArr.add(2, "hola");

        //display the array.
        System.out.println("String array after adding hola: " + strArr);

        //in one instruction move bye to right after hello.
        strArr.add(1, strArr.remove(3));
        System.out.println("String array after moving bye: " + strArr);

    }
}
