import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("0. Fim");
            System.out.println("1. Retirada");
            System.out.println("2. Reposição");
            System.out.println("3. Alterar preço unitário");
            System.out.println("4. Exibir valor do estoque");
            System.out.println("5. Exibir dados do produto");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Fim do programa.");
                    break;
                case 1:
                    System.out.print("Digite a quantidade a ser retirada: ");
                    int quantidadeRetirada = scanner.nextInt();
                    produto.retirada(quantidadeRetirada);
                    break;
                case 2:
                    System.out.print("Digite a quantidade a ser reposta: ");
                    int quantidadeReposicao = scanner.nextInt();
                    produto.reposicao(quantidadeReposicao);
                    break;
                case 3:
                    System.out.print("Digite o novo preço unitário: ");
                    float novoPreco = scanner.nextFloat();
                    produto.setPreco(novoPreco);
                    break;
                case 4:
                    System.out.println("Valor do estoque: R$ " + produto.calcularValorEstoque());
                    break;
                case 5:
                    System.out.println(produto);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
        System.out.println("FIM!");

    }
}
