package group1.lesson10.stack;

public class Stack {

    int[] array;
    int index;

    Stack() {
        array = new int[10];
        index = -1;
    }

    Stack(int length) {
        array = new int[length];
        index = -1;
    }

    void push(int item) {
        if (index == array.length - 1) {
            System.out.println("stack is full");
        } else {
            array[++index] = item;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return array[index--];
        }
    }

}
