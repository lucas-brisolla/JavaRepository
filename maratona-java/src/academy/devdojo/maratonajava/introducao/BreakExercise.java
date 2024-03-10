package academy.devdojo.maratonajava.introducao;

public class BreakExercise {
    // dado valor de um carro descubra em tantas vezes ele pode ser parcelado
    // valorParcela >= 1000
    public static void main(String[] args) {
        int carPrice = 70000;
        for (int carInst = 1; carInst <= carPrice; carInst += 1000) {
            if (carInst == carPrice) {
                break;
            }
            System.out.println(carInst);
        }
    }
}
