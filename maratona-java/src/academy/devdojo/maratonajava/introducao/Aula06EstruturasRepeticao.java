package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao {
    public static void main(String[] args) {
        int counter = 0;

        while (counter < 10) {
            System.out.println(counter);
            counter++;
        }
        do {
            System.out.println("Inside do-while");
        } while (counter > 10);
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
