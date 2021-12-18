package core.lesson10;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack1 = new Stack();

        stack.push(34);
        stack.push(44);
        stack.push(54);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }

}
