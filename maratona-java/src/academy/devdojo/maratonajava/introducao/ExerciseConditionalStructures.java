package academy.devdojo.maratonajava.introducao;

public class ExerciseConditionalStructures {
    public static void main(String[] args) {
        double salary = 70000;
        double taxRate1 = 9.70 / 100;
        double taxRate2 = 37.35 / 100;
        double taxRate3 = 49.50 / 100;
        double taxAmount;

        if (salary <= 34712) {
            taxAmount = salary * taxRate1;
        } else if (salary >= 34713 && salary <= 68507) {
            taxAmount = salary * taxRate2;
        } else {
            taxAmount = salary * taxRate3;
        }
        System.out.println(taxAmount);
    }
}
