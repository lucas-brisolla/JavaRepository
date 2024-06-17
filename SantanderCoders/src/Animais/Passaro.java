package Animais;

public class Passaro extends Animais {
    static int QtdDePassaros;

    public Passaro(String nome, String cor, int idade, double peso, char sexo, String reacao) {
        super(nome, cor, idade, peso, sexo, reacao);
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

    @Override
    public void soar(){
        System.out.println("PIU PIU");
    }
}
