package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao03 {
    public static void main(String[] args) {
        double carPrice = 170000;
        for (int carInst = (int) carPrice; carInst >= 1; carInst--) {
            double carInstValue = carPrice / carInst;
            if (carInstValue < 1000) {
                continue;
            }
            System.out.println("The installment of the car " + carInst + " $ " + carInstValue);
        }
    }
}