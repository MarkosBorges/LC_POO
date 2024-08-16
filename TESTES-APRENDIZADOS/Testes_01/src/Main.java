public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Produto produto1 = new Produto();
        System.out.println(produto1.nome);
        System.out.println(produto1.valor);
        System.out.println(produto1.estoque);

    }
}

class Produto{
    String nome;
    double valor;
    int estoque;
}