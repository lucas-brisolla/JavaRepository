package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,8,8,2};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[1]);
        }
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
