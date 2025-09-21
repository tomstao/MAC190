package com.MAC286.stacks;

import com.MAC286.queues.OurQueue;

import java.util.Random;

/*

1- Create a Stack of integers and fill it with 20 random numbers between -300 and +300.

2- Using two additional Stacks (extra for help) reorganize the original stack so that

all negative numbers go to the bottom of the stack and positive to the top. The order in which negative and positive number were in the original stack should be maintained.

3- Using only one Queue and One extra Stack for help, solve the same problem.

4- Using only one OurArray object for help Object solve the same problem

5- Using only one Queue for help solve the same problem.
 */
public class solution {

    public static OurStack<Integer> createRandomStack() {
        OurStack<Integer> stack = new OurStack<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int num = rand.nextInt(601) - 300;
            stack.push(num);
        }
        return stack;
    }

    public static void reorganizeWithTwoStacks(OurStack<Integer> originalStack) {
        System.out.println("Problem 2: Using two additional stacks");
        System.out.println("Original stack: " + originalStack);

        OurStack<Integer> positiveStack = new OurStack<>();
        OurStack<Integer> negativeStack = new OurStack<>();

        while (!originalStack.isEmpty()) {
            Integer num = originalStack.pop();
            if (num >= 0) {
                positiveStack.push(num);
            } else {
                negativeStack.push(num);
            }
        }

        while (!negativeStack.isEmpty()) {
            originalStack.push(negativeStack.pop());
        }

        while (!positiveStack.isEmpty()) {
            originalStack.push(positiveStack.pop());
        }

        System.out.println("Reorganized stack: " + originalStack);
    }

    public static void reorganizeWithQueueAndStack(OurStack<Integer> originalStack) {
        System.out.println("Problem 3: Using one queue and one stack");
        System.out.println("Original stack: " + originalStack);

        OurQueue<Integer> queue = new OurQueue<>();
        OurStack<Integer> tempStack = new OurStack<>();

        while (!originalStack.isEmpty()) {
            queue.add(originalStack.pop());
        }

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            Integer num = queue.remove();
            if (num >= 0) {
                tempStack.push(num);
            } else {
                queue.add(num);
            }
        }

        while (!queue.isEmpty()) {
            originalStack.push(queue.remove());
        }

        while (!tempStack.isEmpty()) {
            originalStack.push(tempStack.pop());
        }

        System.out.println("Reorganized stack: " + originalStack);
    }

    public static void reorganizeWithOnlyQueue(OurStack<Integer> originalStack) {
        System.out.println("\nProblem 5: Using only one queue");
        System.out.println("Original stack: " + originalStack);

        OurQueue<Integer> queue = new OurQueue<>();
        int stackSize = originalStack.size();

        while (!originalStack.isEmpty()) {
            queue.add(originalStack.pop());
        }

        for (int i = 0; i < stackSize; i++) {
            Integer num = queue.remove();
            if (num < 0) {
                queue.add(num);
            } else {
                originalStack.push(num);
            }
        }

        int negativeCount = queue.size();
        OurStack<Integer> tempStack = new OurStack<>();

        while (!originalStack.isEmpty()) {
            tempStack.push(originalStack.pop());
        }

        for (int i = 0; i < negativeCount; i++) {
            originalStack.push(queue.remove());
        }

        while (!tempStack.isEmpty()) {
            originalStack.push(tempStack.pop());
        }

        System.out.println("Reorganized stack: " + originalStack);
    }

    public static void main(String[] args) {
        OurStack<Integer> stack1 = createRandomStack();
        OurStack<Integer> copyStack2 = copyStack(stack1);
        OurStack<Integer> copyStack3 = copyStack(stack1);
        OurStack<Integer> copyStack5 = copyStack(stack1);

        reorganizeWithTwoStacks(stack1);
        reorganizeWithQueueAndStack(copyStack3);
        reorganizeWithOnlyQueue(copyStack5);
    }

    public static OurStack<Integer> copyStack(OurStack<Integer> original) {
        OurStack<Integer> temp = new OurStack<>();
        OurStack<Integer> copy = new OurStack<>();

        while (!original.isEmpty()) {
            temp.push(original.pop());
        }

        while (!temp.isEmpty()) {
            Integer value = temp.pop();
            original.push(value);
            copy.push(value);
        }

        return copy;
    }
}
