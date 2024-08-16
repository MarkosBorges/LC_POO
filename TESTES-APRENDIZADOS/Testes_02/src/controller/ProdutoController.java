package controller;

public class ProdutoController {

    public static void main(String[] args) {

//        int a = 10;
//        double b = 20.0;

        Produto produto1 = new Produto("Mouse",13.0,13);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        //produto1.setValor(5.0);
        //System.out.println(produto1.getValor());
        produto1.setEstoque(5);//Tenta/modifica valor do estoque
        System.out.println(produto1.getEstoque());//Imprimir o valor real do estoque - VER NAS REGRAS DE NEGOCIO

        System.out.println();
        Produto produto2 = new Produto("Teclado", 59.0,8);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        System.out.println();
        Produto produto3 = new Produto("Celular", 959.0,10);
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());

        System.out.println();
        Produto produto4 = new Produto();
        System.out.println(produto4.getNome());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());

    }
}

class Produto{
//COnstrutor Parametrizado
    //Com o "private" reencapsulamos os atributos dentro da classe produto
    private String nome;
    private double valor;
    private int estoque;

//Construtor Padrão
    public Produto() {
    }

    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    //Metodos de acesso
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

    //Regra de negócio para o estoque
    // O atributo estoque sem vai ser igual ao estoque setado
//    public void setEstoque(int estoque) {
//        int novoEstoque = this.estoque + estoque;
//        if(novoEstoque == estoque){
//            this.estoque = estoque;
//        }
//    }

    //O atributo estoque só vai modificar(atualizar) se for um numero maior que zero
    // ao contrario ele vai manter o mesmo numero de estoque
    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(novoEstoque > 0){
            this.estoque = estoque;
            System.out.println("Estoque atualizado com sucesso!" + " \nNovo estoque: " + estoque + " itens");
        }
    }
}


