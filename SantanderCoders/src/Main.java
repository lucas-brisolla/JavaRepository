import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro doginho = new Cachorro();
        Cachorro doguinho2 = new Cachorro("Cerberus", "Preto", 9, 5.34, 'M', "neutro");
//        doginho.nome = "Cerberus";
//        doginho.cor = "Preto";
//        doginho.idade = 9;
//        doginho.sexo = 'M';

        System.out.println(doginho.interagir("O cachorro está "));
        System.out.println(doginho.interagir("pisar no rabo"));
        System.out.println(doginho.interagir("dar comida"));
        System.out.println("O cachorro está " + doginho.interagir("carinho"));
    }
}