package com.mac190.SetterGetter;

/*
Design and test a clas Even that has the following:
One private integer member variable num that is even at all times.
- Getter for num.
- setter for num, that makes sure the value of num is evee, if not then
set it to the next even number. (If the input is odd add one to it).

- method String toString return num: itsValue as a string.
-method equals(Even E) returns true if E is the same as this object even and false if not

//Do this later
- method public Even add(int a) this method creates an Even object simular to this
one and adds a to it and returns it.
- method public Even add(Even E) this method creates an Even object similar to this
one and adds E.a to it and returns it.


 */

public class Main {
    public static void main(String[] args) {
        //create an Even object with num equals to 3
        Even e  = new Even();
        e.setNum(3);
        //display it, using the toString()
        System.out.println(e);
        //create an Even Object with num as 4
        Even e2 = new Even();
        e2.setNum(4);
        //display it
        System.out.println(e2);
        //compare the two Even objects if they are the same.
        boolean equality = e.equals(e2);
        System.out.println(equality);
    }
}
