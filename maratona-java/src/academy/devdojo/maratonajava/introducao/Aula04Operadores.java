package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // numeric operators + - / *
        int num = 100;
        int num1 = 500;
        int adc = num + num1;
        int sbc = num - num1;
        int mlc = num * num1;
        int dvc = num1 / num;

        // logical operators < > <= >= == != booleans AND -> && OR -> || not -> !
        boolean isFiveBiggerThanTwo = 5 > 2;
        int age = 30;
        float salary = 3500f;
        boolean isLegalBiggerThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalSmallerThanThirty = age < 30 && salary >= 3381;

        int bonus = 2800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        int counter = 0;
        counter++;
        System.out.println(counter);
        System.out.println(bonus);

        System.out.println(adc);
        System.out.println(sbc);
        System.out.println(mlc);
        System.out.println(dvc);
        System.out.println(isFiveBiggerThanTwo);
        System.out.println(isLegalBiggerThanThirty);
        System.out.println(isLegalSmallerThanThirty);
    }
}
