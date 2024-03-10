package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

        days[2][0] = 31;
        days[2][1] = 30;
        days[2][2] = 31;


        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println("Month ends on day: " + days[i][j]);
            }
        }

        System.out.println("----------------------------------------------");

        for (int[] arrBase : days) {
            for (int num : arrBase) {
                System.out.println("Month ends on day: " + num);
            }
        }
    }
}
