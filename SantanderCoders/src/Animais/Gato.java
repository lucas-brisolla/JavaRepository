package Animais;

public class Gato extends Animais {
    static  int QtdDeGatos;

    public Gato(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        super(nome, cor, idade, peso, sexo, reacao);
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static int getQtdDeGatos() {
        return QtdDeGatos;
    }

    public static void setQtdDeGatos(int qtdDeGatos) {
        QtdDeGatos = qtdDeGatos;
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

    public String getReacao() {
        return reacao;
    }

    public void setReacao(String reacao) {
        this.reacao = reacao;
    }
    @Override
    public void soar(){
        System.out.println("MIAU");
    }
}

