import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto produto = new Produto("CANETA", 10, 0.5);
        Produto p2 = new Produto("LAPIS", 20, 0.3);
        Produto p3 = new Produto("BORRACHA", 50, 1.5);

        Scanner scanner = new Scanner(System.in);

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
                    produto.retira(quantidadeRetirada);
                    break;
                case 2:
                    System.out.print("Digite a quantidade a ser reposta: ");
                    int quantidadeReposicao = scanner.nextInt();
                    produto.repoe(quantidadeReposicao);
                    break;
                case 3:
                    System.out.print("Digite o novo preço unitário: ");
                    double novoPreco = scanner.nextDouble();
                    produto.alteraPrecoUnitario(novoPreco);
                    break;
                case 4:
                    System.out.println("Valor do estoque: R$ " + produto.obtemValorEstoque());
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
