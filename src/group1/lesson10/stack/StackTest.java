package group1.lesson10.stack;

public class StackTest {

    public static void main(String[] args) {
        //հայտարարել ենք Stack-ի օբյեկտ
        Stack stack = new Stack(50);

        stack.push(45);
        stack.push(55);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(65);

        Stack stack1 = new Stack();

    }
}
