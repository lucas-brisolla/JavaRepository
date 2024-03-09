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

        // logical operators < > <= => == != booleans AND OR
        boolean isFiveBiggerThanTwo = 5 > 2;

        System.out.println(adc);
        System.out.println(sbc);
        System.out.println(mlc);
        System.out.println(dvc);
        System.out.println(isFiveBiggerThanTwo);
    }
}
