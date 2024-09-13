public class Mp3Player extends ProdutoPlayer {
    // Atributo
    private int memoria;

    // Método construtor
    public Mp3Player(int codigo, int memoria) {
        super(codigo); // Invoca o construtor da superclasse Produto
        this.memoria = memoria;
    }

    // Método para retornar a memória do Mp3Player
    public int getMemoria() {
        return memoria;
    }

    // Método para exibir os dados do Mp3Player
    @Override
    public void exibe() {
        super.exibe(); // Invoca o método Exibe da superclasse Produto
        System.out.printf("Memória: %d GB%n", memoria);
    }
}
