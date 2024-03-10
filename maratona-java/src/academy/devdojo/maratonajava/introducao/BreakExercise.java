package academy.devdojo.maratonajava.introducao;

public class BreakExercise {
    // dado valor de um carro descubra em tantas vezes ele pode ser parcelado
    // valorParcela >= 1000
    public static void main(String[] args) {
        int carPrice = 170000;

        for (int carInst = 1; carInst <= carPrice; carInst++) {
            double carInstValue = carPrice / carInst;
            if (carInstValue < 1000) {
                break;
            }
            System.out.println("The installment of the car " + carInst + " $ " + carInstValue);
        }
    }
}
