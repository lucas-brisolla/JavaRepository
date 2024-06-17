package Animais;

public class Cachorro extends Animal {

    static int QtdDeCachorros;



    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.reacao = reacao;
        QtdDeCachorros ++;
    }

    public static int getQtdDeCachorros() {
        return QtdDeCachorros;
    }

    public static void setQtdDeCachorros(int qtdDeCachorros) {
        Cachorro.QtdDeCachorros = qtdDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getReacao() {
        return reacao;
    }

    public void setReacao(String reacao) {
        this.reacao = reacao;
    }


    public String interagir(String acao) {
//        if (acao.equals("carinho")) {
//            this.reacao = "feliz";
//        } else if (acao.equals("pisar no rabo")) {
//            latir();
//            System.out.println("Voce pisou no rabo do cachorro!");
//            this.reacao = "triste";
//        } else {
//            this.reacao = "neutro";
//        }

        switch (acao) {
            case "carinho":
                this.reacao = "feliz";
                break;
            case "pisar no rabo":
                soar();
                this.reacao = "triste";
                break;
            case "dar comida":
                this.reacao = "satisfeito";
                break;
            default:
                this.reacao = "neutro";
                break;
        }
        return this.reacao;
    }
    @Override
    public void soar(){
        System.out.println("AU AU");
    }
}
