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

public class Even {
    private int num;

    public void setNum(int val) {
        this.num = val % 2 == 0 ? val : val + 1;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "" + this.num;
    }

    public boolean equals(Even E) {
        return this.num == E.getNum();
    }

    public Even add(int E) {
        Even even = new Even();
        even.setNum(this.num + E);
        return even;
    }

    public Even add(Even E) {
        Even even = new Even();
        even.setNum(this.num + E.num);
        return even;
    }


}
