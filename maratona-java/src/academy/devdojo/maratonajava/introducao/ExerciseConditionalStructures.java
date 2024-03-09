package academy.devdojo.maratonajava.introducao;

public class ExerciseConditionalStructures {
    public static void main(String[] args) {
        double salary = 40000;
        double taxRate1 = 9.70;
        double taxRate2 = 37.35;
        double taxRate3 = 49.50;

        if (salary <= 34712) {
            System.out.println(salary - taxRate1);
        } else if (salary <= 68507) {
            System.out.println(salary - taxRate2);
        } else {
            System.out.println(salary - taxRate3);
        }
    }
}
