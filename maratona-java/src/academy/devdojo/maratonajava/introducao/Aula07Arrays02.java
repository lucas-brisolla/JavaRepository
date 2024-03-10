package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Vegeta";
        names[2] = "Frieza";
        names[3] = "Android N°17";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
