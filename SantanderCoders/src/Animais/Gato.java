package Animais;

public class Gato {
    static int QtdDeGatos;
    private String nome;
    private String cor;
    private int idade;
    private double peso;
    private char sexo;
    private String reacao;

    public Gato(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.reacao = reacao;
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

    private void comer(){}
    private void dormir(){}

    private void soar(){
        System.out.println("MIAU");
    }
}

