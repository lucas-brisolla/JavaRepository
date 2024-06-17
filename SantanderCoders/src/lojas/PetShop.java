package lojas;
import Animais.Animal;
import Animais.Cachorro;
public class PetShop {
    public void darBanho(Animal animal){
        animal.setReacao("Limpo");
    }public void tosar(Cachorro cachorro){
        cachorro.setReacao("Tosado");
    }public void deixarNoHotel(Animal animal){
        animal.setReacao("Está com saudades");
    }
}
