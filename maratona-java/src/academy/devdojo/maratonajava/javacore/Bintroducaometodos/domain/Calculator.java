package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(5 + 3);
    }

    public void subTwoNumbers() {
        System.out.println(6 - 3);
    }

    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error!!!");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 23;
        System.out.println("Inside the changeTwoNumbers");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
