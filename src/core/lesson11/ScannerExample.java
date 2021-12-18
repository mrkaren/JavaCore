package core.lesson11;

import core.calc.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("please input operation (+, -, *, /), or 0 for exit");
            String operation = scanner.next();
            if (operation.equals("0")) {
                break;
            }
            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*")
                    && !operation.equals("/")) {
                System.out.println("invalid operation");
            } else {
                System.out.println("please input a");
                int a = scanner.nextInt();
                System.out.println("please input b");
                int b = scanner.nextInt();
                switch (operation) {
                    case "+":
                        System.out.println(calculator.plus(a, b));
                        break;
                    case "-":
                        System.out.println(calculator.minus(a, b));
                        break;
                    case "/":
                        System.out.println(calculator.divide(a, b));
                        break;
                    case "*":
                        System.out.println(calculator.multiple(a, b));
                        break;

                }
            }


        }


    }

}
