import java.util.ArrayList;
import java.util.List;

public class CD extends ProdutoPlayer {
    // Atributos
    private String nomeArtista;
    private List<String> faixas;

    // Método construtor
    public CD(int codigo, String nome) {
        super(codigo); // Invoca o construtor da superclasse Produto
        this.nomeArtista = nome;
        this.faixas = new ArrayList<>();
    }

    // Método para incluir faixa no cd
    public void incluiFaixa(String titulo) {
        faixas.add(titulo); // Chamada do método da classe List
    }

    // Método para retornar o número de faixas do cd
    public int getQuantidadeDeFaixas() {
        return faixas.size(); // Chamada do método da classe List
    }

    // Método para retornar o nome de uma faixa do cd
    public String consultaFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            return faixas.get(indice); // Chamada do método da classe List
        }
        return "Faixa inválida.";
    }

    // Método para exibir os dados do cd
    @Override
    public void exibe() {
        super.exibe(); // Invoca o método Exibe da superclasse Produto
        System.out.printf("Artista: %s%nQuantidade de faixas: %d%n", nomeArtista, faixas.size());
        for (int i = 0; i < faixas.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, faixas.get(i));
        }
    }
}
