import model.Produto;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class ControllerList {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Arroz", 10.50,150);
        Produto prod2 = new Produto("Feijão", 8.50,150);
        Produto prod3 = new Produto("Café", 11.50,150);
        Produto prod4 = new Produto("Batata", 6.50,150);
        Produto prod5 = new Produto("Acucar", 4.50,150);

        //Criando coleção e add objetos --------------------------------------------------------
        // List = Interface
        //ArrayList = Classe (é um construtor de arraylist_
        List<Produto> produtos = new ArrayList<>();
        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);
        produtos.add(prod5);
        System.out.println("----- LISTA ORIGINAL -----");
        System.out.println(produtos);

        //ORDENA A COLECAO PELO ATRIBUTO NOME DO PRODUTO --------------------------------------------------------
        //Classe Comparator
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println("------- LISTA ORDENADA -------");
        System.out.println(produtos);

        //PESQUISA FORCA BRUTA --------------------------------------------------------
        System.out.println("\n------- LOCALIZANDO PELO NOME [METODO FORCA BRUTA] -------");
        produtos.forEach(p -> {
            if(p.getNome().equals("Arroz")) {
                System.out.print("Localizado: "+p);
            }
        });

        //PESQUISA FILTER --------------------------------------------------------
        /*
        O método stream().filter() no Java não utiliza, estritamente falando, "força bruta", mas ele realiza
             uma busca linear pelos elementos da coleção. Isso significa que ele verifica cada elemento da lista
             um por um até encontrar o que corresponde ao critério especificado. Esse tipo de busca tem um
             custo de tempo de execução proporcional ao tamanho da lista, ou seja, sua complexidade é O(n), onde n
             é o número de elementos.

         */
        System.out.println("\n\n------- LOCALIZANDO PELO NOME [METODO STREAM-FILTER] -------");
        Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("Acucar")).findAny().orElse(null);
        System.out.println("PRODUTO ENCONTRADO: "+produtoFind);

        //PESQUISA HASHMAP --------------------------------------------------------
        System.out.println("\n\n------- LOCALIZANDO PELO NOME [METODO HASHMAP] -------");
        Map<String, Produto> produtoMap = new HashMap<>();
        produtoMap.put(prod1.getNome().toLowerCase(), prod1);
        produtoMap.put(prod2.getNome().toLowerCase(), prod2);
        produtoMap.put(prod3.getNome().toLowerCase(), prod3);
        produtoMap.put(prod4.getNome().toLowerCase(), prod4);
        produtoMap.put(prod5.getNome().toLowerCase(), prod5);
        System.out.println("PRODUTO ENCONTRADO: "+produtoMap);

        //PESQUISA NA COLECAO DO TIPO MAP --------------------------------------------------------
        System.out.println("\n------ Pesquisa na coleção do tipo MAP ------");
        System.out.println(produtoMap.get(prod1.getNome()));//pesquisando objeto

        //PESQUISA PELA BUSCA DO USUARIO [usando case-insensitive] --------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto que quer pesquisar:");
        String nomeProduto = scanner.nextLine().toLowerCase();

        // Pesquisa no HashMap USANDO O GET --------------------------------------------------------------------------
        Produto produtoEncontrado = produtoMap.get(nomeProduto);

        if (produtoEncontrado != null) {
            System.out.println("PRODUTO ENCONTRADO: " + produtoEncontrado);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
