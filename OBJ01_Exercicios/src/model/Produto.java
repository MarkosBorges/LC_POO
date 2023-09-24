package OBJ01_Exercicios.src.model;

public class Produto {
    private String nome; //tipo classe comeca com letra maiuscula
    private double valor;
    private int estoque;

    public Produto() {//COntrutor padrao/vazio
    }

    public Produto(String nome, double valor, int estoque) {//Contrutor com todos os atributos
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
    /*    public Produto(String nome){
            this.nome = nome;
        }
    */
    //============ GETTERS (leem valores dos atrib) & SETTERS (altera os valores do atrbt)  ===========
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(this.estoque > 0){
            this.estoque = estoque;
        }

    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "Nome: '" + nome + '\'' +
                ", Valor: " + valor +
                ", Estoque: " + estoque +
                '}';
    }
}
