package model;


//Em tempo de projeto, se trabalha com classe. E na memória, trabalhamos com instrancias dessas classes
public class Produto {

    private String nome;
    private double valor;
    private int estoque;

    //COnstrutor padrão ou vazio
    public Produto() {
    }

    //Construtor Parametrizado (que recebe argumento na assinatura do metodo)
    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(this.estoque >0){
            this.estoque = estoque;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Metodo utilitario (converte o objeto em String)
    //Conversão do Objeto e Modelo
    @Override
    public String toString() {
        return "Produto{" +
                "Produto: '" + nome + '\'' +
                ", valor: " + valor +
                ", Estoque: " + estoque +
                '}';
    }
}
