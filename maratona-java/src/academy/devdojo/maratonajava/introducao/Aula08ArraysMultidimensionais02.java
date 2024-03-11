package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1,2,3};
        arrayInt[1] = new int[]{1,2};
        arrayInt[2] = new int[]{1,2,3,4,5};

        int[][] arrayInt2 = {{1,2,3},{1,8,9},{1,9,9,9,9}};
        for(int[] arrayBase: arrayInt2){
            for(int num:arrayBase){
                System.out.println(num);
            }
        }
    }
}
