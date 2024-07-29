package controller;
import model.Produto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoController3 {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Arroz", 10.50,150);
        Produto prod2 = new Produto("Feijão", 8.50,150);
        Produto prod3 = new Produto("Café", 11.50,150);
        Produto prod4 = new Produto("Batata", 6.50,150);
        Produto prod5 = new Produto("Acucar", 4.50,150);

        //Criando coleção e add objetos
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

        //Ordena colecao de objetos (ordena pelo nome do produto)
        // :: = operador de resolucao de escopo (algo como: vá dentro da classe Produto e pegue o comportamento getNome)
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println();
        System.out.println("----- LISTA ORDENADA -----");
        System.out.println(produtos);

        produtos.sort(Comparator.comparing(Produto::getNome).reversed());
        System.out.println();
        System.out.println("----- LISTA ORDENADA - REVERSED -----");
        System.out.println(produtos);

        //===============================================================================
        //PESQUISA
        //PESQUISA DE FORCA BRUTA
        System.out.println("\n----- PESQUISA -----");
        produtos.forEach(p ->{
            if(p.getNome().equals("Arroz")){
                System.out.println("Objeto pesquisado ..."+p);
            }
        });

        //PESQUISA
        //METODO FILTER
        System.out.println();
        System.out.print("Pesquisando com o filter usando forEach:");
        produtos.stream().filter(p -> p.getNome().equals("Acucar")).forEach(System.out::println);
        System.out.println();
        Produto produtoFind = produtos.stream().filter(p -> p.getNome().equals("Acucar")).findAny().orElse(null);
        System.out.println("Localizando produto usando o filter: "+produtoFind);
        //System.out.println(produtoFind);


    }
}

