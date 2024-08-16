package controller;
import model.Produto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Arroz", 10.50,150);
        Produto prod2 = new Produto("Feijão", 8.50,150);
        Produto prod3 = new Produto("Café", 11.50,150);
        Produto prod4 = new Produto("Batata", 6.50,150);
        Produto prod5 = new Produto("Acucar", 4.50,150);

        System.out.println(prod1.toString());
        System.out.println(prod2.toString());
        System.out.println(prod3.toString());
        System.out.println(prod4.toString());
        System.out.println(prod5.toString());

    }
}
