package core.group1.homework.braceChecker;

public class Stack {

    private int[] array;
    private int index;

    Stack() {
        array = new int[10];
        index = -1;
    }

    Stack(int length) {
        array = new int[length];
        index = -1;
    }

    public void push(int item) {
        if (index == array.length - 1) {
            System.out.println("stack is full");
        } else {
            array[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }

}
