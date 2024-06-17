package Animais;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int idade;
    protected double peso;
    protected char sexo;
    protected String reacao;

    public Animal(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.reacao = reacao;
    }

    public Animal() {

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

    protected void comer(){}
    protected void dormir(){}
    public void soar() {
        System.out.println("    ");
    }
}
