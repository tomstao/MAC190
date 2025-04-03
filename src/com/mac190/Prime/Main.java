package com.mac190.Prime;

/*

Design an implement a class Prime that has the following properties:
- One private member variable prime that is prime.
- default constructor that sets prime to the first prime (2);
- A constructor that accepts an integer and sets prime to the first prime close
to the input value. For instance if the input is B, then prime will be set to 11
(use setter here)
- getter
- setter that sets prime to the closet prime to the input value.
- toString to return the object as a string
- equalCoordinate to compare two Prime objects.
 public Prime add(int a ) that returns a Prime object as the sum of this and a
 - public Prime add(Prime p) that return an object Prime as the sum of thw two primes this and p. The result has to be a
 prime number.

to find out if a number is prime or not we can use static method isPrime(int a ),
that return true if a is prime and false if not.
public static boolean isPrime(int a) {
                if a is smaller that 2 return false
                if a is 2 return true

                loop i from 3 to sqrt()
}
 */
public class Main {
    public static void main(String[] args) {
        Prime defaultPrime = new Prime();
        System.out.println("Default input: " + defaultPrime);
        System.out.println("*".repeat(25));

        Prime prime = new Prime(8);
        System.out.println("input 8:" + prime);
        System.out.println("*".repeat(25));


        Prime addInt = prime.add(1);
        System.out.println("after adding 1: " + addInt);
        System.out.println("*".repeat(25));


        Prime addPrime = prime.add(addInt);
        System.out.println("after adding two objects(11 and 13): " + addPrime);
        System.out.println("*".repeat(25));


        Prime prime2 = new Prime(24);
        System.out.println("Input 24: " + prime2);
        System.out.println("*".repeat(25));


        Prime p1 = new Prime(29);
        System.out.println("Input 29: " + p1);
        System.out.println("*".repeat(25));

        boolean equals = p1.equals(prime2);
        System.out.println("Does input of 29 equal to 24? " + (equals ?  "Yes" : "No"));

//        Prime p3 = p1.add(10);
//        System.out.println("After adding 10: " + p3);
//        System.out.println("*".repeat(25));
//        Prime p2 = p1.add(p3);
//        p2.add(4);
//        System.out.println("After adding 4 to p2: " + p2);
//        System.out.println("*".repeat(25));
//        System.out.println("p1 + p2 + p3:" + p3.add(p1.add(p2)));

        Prime p3 = Prime.add(p1,10);
        System.out.println("add 10 to p1: " + p3);

        Prime p2 = Prime.add(p1,p3);
        System.out.println("add p1 and p3:" + p2);

        p2 = Prime.add(p2,4);
        System.out.println("p2 add 4:" + p2);
        p2 = Prime.add(Prime.add(p1,p3), p2);
        System.out.println("p1 + p2 + p3:" + p2);

    }
}
