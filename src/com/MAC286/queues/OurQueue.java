package com.MAC286.queues;

import java.util.NoSuchElementException;

public class OurQueue<T>{
    private T[] queue;
    private int size;

    @SuppressWarnings("unchecked")
    public OurQueue() {
        size = 0;
        queue = (T[]) new Object[10];
    }

    public OurQueue(T[] queue, int size) {
        this.queue = queue;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public void add(T item){
        if(isFull()){
            reSize(size * 2);
        }
        queue[size++] = item;
    }

    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue[--size];
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue[size - 1];
    }

    @SuppressWarnings("unchecked")
    public void reSize(int size) {
        this.size = size;
        T[] newQueue = (T[]) new Object[size];
        System.arraycopy(queue, 0, newQueue, 0, size);
        this.queue = newQueue;
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
