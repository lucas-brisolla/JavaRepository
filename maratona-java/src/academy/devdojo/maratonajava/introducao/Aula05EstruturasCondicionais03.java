package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String donateMessage = "I will donate R$500 to DevDojo";
        String dontDonateMessage = "I can't do it now";
        String result = salary >= 5000 ? donateMessage : dontDonateMessage;
        System.out.println(result);
    }
}
