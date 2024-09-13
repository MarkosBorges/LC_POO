import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cod, quant, mem;
        double preco, percentual, novoPreco;

        /*
        // Entradas dos dados de um Produto Mp3Player
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto:"));
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto em estoque:"));
        mem = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de memória do mp3:"));

        // Instancia e carrega o código e a memória do Produto Mp3Player
        Mp3Player modelo = new Mp3Player(cod, mem);
        modelo.setPreco(preco); // Chamada do método para carregar o preço do Produto Mp3Player
        modelo.repoe(quant); // Chamada do método para repor quantidade do Produto Mp3Player

        // Entrada do percentual de aumento no preço do Produto Mp3Player
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de aumento: "));
        novoPreco = modelo.getPreco() * (1 + percentual / 100); // Cálculo do novo preço com aumento
        modelo.setPreco(novoPreco); // Atualiza o novo preço

        // Exibe os dados do Produto Mp3Player
        modelo.exibe();

         */

        //======================= NOVO MENU =================================
        Scanner scanner = new Scanner(System.in);
        List<ProdutoPlayer> produtos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n=== Menu Produto Player ===");
            System.out.println("1. Adicionar Mp3Player");
            System.out.println("2. Adicionar CD");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Repor Estoque");
            System.out.println("5. Retirar Estoque");
            System.out.println("6. Atualizar Preço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarMp3Player(scanner, produtos);
                    break;
                case 2:
                    adicionarCD(scanner, produtos);
                    break;
                case 3:
                    listarProdutos(produtos);
                    break;
                case 4:
                    reporEstoque(scanner, produtos);
                    break;
                case 5:
                    retirarEstoque(scanner, produtos);
                    break;
                case 6:
                    atualizarPreco(scanner, produtos);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Função para adicionar Mp3Player
    public static void adicionarMp3Player(Scanner scanner, List<ProdutoPlayer> produtos) {
        System.out.print("Digite o código do Mp3Player: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade de memória (GB): ");
        int memoria = scanner.nextInt();

        Mp3Player mp3 = new Mp3Player(codigo, memoria);
        System.out.print("Digite o preço do Mp3Player: ");
        double preco = scanner.nextDouble();
        mp3.setPreco(preco);
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        mp3.repoe(quantidade);

        produtos.add(mp3);
        System.out.println("Mp3Player adicionado com sucesso!");
    }

    public static void adicionarCD(Scanner scanner, List<ProdutoPlayer> produtos) {
        System.out.print("Digite o código do CD: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Digite o nome do artista: ");
        String artista = scanner.nextLine();

        CD cd = new CD(codigo, artista);
        System.out.print("Digite o preço do CD: ");
        double preco = scanner.nextDouble();
        cd.setPreco(preco);
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        cd.repoe(quantidade);

        System.out.print("Quantas faixas deseja adicionar ao CD? ");
        int numFaixas = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        for (int i = 1; i <= numFaixas; i++) {
            System.out.print("Digite o nome da faixa " + i + ": ");
            String faixa = scanner.nextLine();
            cd.incluiFaixa(faixa);
        }

        produtos.add(cd);
        System.out.println("CD adicionado com sucesso!");
    }

    // Função para listar todos os produtos
    public static void listarProdutos(List<ProdutoPlayer> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (ProdutoPlayer produto : produtos) {
                produto.exibe();
                System.out.println("-------------------------");
            }
        }
    }

    // Função para repor estoque
    public static void reporEstoque(Scanner scanner, List<ProdutoPlayer> produtos) {
        System.out.print("Digite o código do produto para repor estoque: ");
        int codigo = scanner.nextInt();
        ProdutoPlayer produto = buscarProdutoPorCodigo(produtos, codigo);

        if (produto != null) {
            System.out.print("Digite a quantidade a ser reposta: ");
            int quantidade = scanner.nextInt();
            produto.repoe(quantidade);
            System.out.println("Estoque reposto com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Função para retirar estoque
    public static void retirarEstoque(Scanner scanner, List<ProdutoPlayer> produtos) {
        System.out.print("Digite o código do produto para retirar estoque: ");
        int codigo = scanner.nextInt();
        ProdutoPlayer produto = buscarProdutoPorCodigo(produtos, codigo);

        if (produto != null) {
            System.out.print("Digite a quantidade a ser retirada: ");
            int quantidade = scanner.nextInt();
            if (produto.retira(quantidade)) {
                System.out.println("Estoque retirado com sucesso!");
            } else {
                System.out.println("Quantidade insuficiente no estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Função para atualizar o preço de um produto
    public static void atualizarPreco(Scanner scanner, List<ProdutoPlayer> produtos) {
        System.out.print("Digite o código do produto para atualizar o preço: ");
        int codigo = scanner.nextInt();
        ProdutoPlayer produto = buscarProdutoPorCodigo(produtos, codigo);

        if (produto != null) {
            System.out.print("Digite o novo preço: ");
            double novoPreco = scanner.nextDouble();
            produto.setPreco(novoPreco);
            System.out.println("Preço atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // Função para buscar produto por código
    public static ProdutoPlayer buscarProdutoPorCodigo(List<ProdutoPlayer> produtos, int codigo) {
        for (ProdutoPlayer produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;

    }
}
