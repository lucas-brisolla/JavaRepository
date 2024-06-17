import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import lojas.PetShop;

public class Main {
    public static void main(String[] args) {
        Cachorro doginho = new Cachorro("Cerberus", "Preto", 9, 5.34, 'M', "neutro");
        Gato gato = new Gato("Aphonso", "Laranja", 5, 8.34, 'M', "neutro");
        Passaro passarinho = new Passaro("Canário", "Cinza", 1, 0.50, 'M', "neutro");

        PetShop petshop = new PetShop();

        System.out.println(doginho.interagir("O cachorro está "));
        System.out.println(doginho.interagir("pisar no rabo"));
        System.out.println(doginho.interagir("dar comida"));
        System.out.println("O cachorro está " + doginho.interagir("carinho"));

        doginho.soar();
        gato.soar();
        passarinho.soar();

        petshop.tosar(doginho);
        System.out.println("O " + doginho.getNome() + " está " + doginho.getReacao());

        petshop.darBanho(gato);
        System.out.println("O " + gato.getNome() + " está " + gato.getReacao());

        petshop.deixarNoHotel(passarinho);
        System.out.println("O " + passarinho.getNome() + " está " + passarinho.getReacao());
    }
}