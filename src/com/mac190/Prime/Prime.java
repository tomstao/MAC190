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
- equals to compare two Prime objects.
 public Prime add(int a) that returns a Prime object as the sum of this and a
 - public Prime add(Prime p) that return an object Prime as the sum of thw two primes this and p. The result has to be a
 prime number.

 */
public class Prime {
    private int prime;

    // Default constructor
    public Prime() {
        this.prime = 2;
    }

    // Constructor that sets input to the closet prime.
    public Prime(int num) {
        this.setPrime(num);
    }

    @Override
    public String toString() {
        return "prime= " + prime;
    }

    public void setPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        this.prime = num;
    }

    public int getPrime() {
        return prime;
    }

    public boolean equals(Prime other) {
        return this.prime == other.getPrime();
    }

    private static boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Prime add(int num) {
        return new Prime(this.prime + num);
    }

    public Prime add(Prime other) {
        return new Prime(this.prime + other.getPrime());
    }

    public static Prime add(Prime a, Prime b) {
        return new Prime(a.getPrime() + b.getPrime());
    }
    public static Prime add(Prime p, int num) {
        return new Prime(p.getPrime() + num);
    }
}
