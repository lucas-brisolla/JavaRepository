package Animais;

public class Passaro {
    static int QtdDePassaros;
    private String nome;
    private String cor;
    private int idade;
    private double peso;
    private char sexo;
    private String reacao;

    public Passaro(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.reacao = reacao;
    }

    public static int getQtdDePassaros() {
        return QtdDePassaros;
    }

    public static void setQtdDePassaros(int qtdDePassaros) {
        QtdDePassaros = qtdDePassaros;
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

    private void Voar(){}
    private void Bicar(){}
    private void Soar(){
        System.out.println("PIU PIU");
    }
}
