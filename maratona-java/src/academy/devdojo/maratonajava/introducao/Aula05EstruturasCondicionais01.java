package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean majorAge = idade >= 18;
        if(majorAge){
            System.out.println("Buy alchoolic drinks is authorized");
        }else{
            System.out.println("You can't buy alchoolic drinks!");
        }
    }
}
