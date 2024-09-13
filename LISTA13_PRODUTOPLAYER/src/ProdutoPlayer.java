public class ProdutoPlayer {
    // Atributos
    private int codigo;
    private double preco;
    private int quantidade;

    // Método construtor
    public ProdutoPlayer(int codigo) {
        this.codigo = codigo;
        this.preco = 0;
        this.quantidade = 0;
    }

    // Método para retornar o código do Produto
    public int getCodigo() {
        return codigo;
    }

    // Método para retornar o preço do Produto
    public double getPreco() {
        return preco;
    }

    // Método para retornar a quantidade do Produto em estoque
    public int getQuantidade() {
        return quantidade;
    }

    // Método para retornar o valor total dos Produtos em estoque
    public double getValorEstoque() {
        return preco * quantidade;
    }

    // Método para atribuir valor ao atributo preco
    public void setPreco(double valor) {
        this.preco = valor;
    }

    // Método para repor quantidade de Produto em estoque
    public void repoe(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    // Método para retirar quantidade de Produto em estoque
    public boolean retira(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false;
    }

    // Método para exibir os dados do Produto
    public void exibe() {
        System.out.printf("Código: %d%nPreço: R$%.2f%nQuantidade: %d%n", codigo, preco, quantidade);
    }
}
