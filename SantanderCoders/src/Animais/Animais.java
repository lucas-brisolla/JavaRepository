package Animais;

public class Animais {
    protected String nome;
    protected String cor;
    protected int idade;
    protected double peso;
    protected char sexo;
    protected String reacao;

    public Animais(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.reacao = reacao;
    }

    public Animais() {

    }


    protected void comer(){}
    protected void dormir(){}
    public void soar() {
        System.out.println("    ");
    }
}
