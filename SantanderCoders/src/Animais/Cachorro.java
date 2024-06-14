package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int idade;
    public double peso;
    public char sexo;
    public String reacao;

    public void latir() {
        System.out.println("AU AU");
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.reacao = "feliz";
        } else if (acao.equals("pisar no rabo")) {
            latir();
            System.out.println("Voce pisou no rabo do cachorro!");
            this.reacao = "triste";
        } else {
            this.reacao = "neutro";
        }
        return reacao;
    }
}
