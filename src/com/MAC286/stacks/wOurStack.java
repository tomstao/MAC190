package com.MAC286.stacks;

import com.MAC286.Vector.OurArray;

/*
    OurArray class has everything needed to implement a Stack.
    We can implement a Stack as a wrapper class around an OurArray object

 */
public class wOurStack<T> {
    //have a reference to an OurArray
    private OurArray<T> ourStack;
    //default constructor. Create an OurArray object
    public wOurStack(){
        ourStack = new OurArray<>();
    }

    //implement size(), isEmpty forwarding the calls to OurArray object
    public boolean isEmpty(){
        return ourStack.isEmpty();
    }
    //implement pop() calling remove in OurArray object
    public T pop() {
        return ourStack.remove();
    }
    //implement push calling add, same for peek() and toString()
    public void push(T t){
        ourStack.add(0,t);
    }
    public T peek(){
        return ourStack.getArray()[ourStack.size() - 1];
    }

    public String toString(){
        return ourStack.toString();
    }

    public int size(){
        return ourStack.size();
    }
}
