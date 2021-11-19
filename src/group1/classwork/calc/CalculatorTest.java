package group1.classwork.calc;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.gumarum(5, 6);
        System.out.println(result);
        result = calculator.hanum(6, 5);
        System.out.println(result);
        long l = calculator.bazmapatkum(5555, 3333);
        System.out.println(l);
        double d = calculator.bajanum(55, 3);
        System.out.println(d);
    }

}
