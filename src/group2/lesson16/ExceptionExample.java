package group2.lesson16;

import group2.lesson14.Student;

public class ExceptionExample {

    public static void main(String[] args)  {
//        int d, a;
//
//        try {
//            d = 0;
//            a = 42 / d;
//            System.out.println("message");
//        } catch (ArithmeticException e) {
//            System.out.println("exception " + e);
//        }
//        System.out.println("after catch block");


//        String str = "0";
//        int number = meth(str);
//        if (number == 0) {
//            System.out.println("please try another number");
//        } else {
//
//            System.out.println(number);
//        }
//
//        try {
//            meth1(0);
//        } catch (MyException e) {
//            e.printStackTrace();
//        }


        try {
            meth1(4);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    static String meth2(String name) {
        return name.trim();
    }

    static void meth1(int a) throws MyException {
        if (a == 0) {
            throw new MyException("Number should not be 0", "ERR0001");
        }
        System.out.println("number is " + a);
    }

    static int meth(String numberStr) {
        try {
            return Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("Number format is wrong!");
            return 0;
        }
    }
}
