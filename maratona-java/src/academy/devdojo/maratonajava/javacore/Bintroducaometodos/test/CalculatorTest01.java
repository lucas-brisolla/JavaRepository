package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subTwoNumbers();
        calculator.multiplyTwoNumbers(8,3);
        calculator.divideTwoNumbers();
        System.out.println("Finishing CalculatorTest01");
    }
}
