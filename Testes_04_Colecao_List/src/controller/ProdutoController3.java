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
        // :: = operador de resolucao de escopo
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println();
        System.out.println("----- LISTA ORDENADA -----");
        System.out.println(produtos);


    }
}

