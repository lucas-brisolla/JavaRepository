package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 18;
        boolean childhood = age < 15;
        boolean youth = age >= 15 && age < 18;

        if(childhood == true){
            System.out.println("Children category");
        }else if(youth == true){
            System.out.println("Youth category");
        }else{
            System.out.println("Adult category");
        }
    }
}
