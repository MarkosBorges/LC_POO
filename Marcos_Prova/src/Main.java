import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um carro de exemplo
        Carro meuCarro = new Carro("Toyota", "Preto", 180, 2020);

        int opcao = 0;

        do {
            System.out.println("\n=== Menu da Concessionária ===");
            System.out.println("1. Vender o carro");
            System.out.println("2. Mostrar a marca do carro");
            System.out.println("3. Mostrar a cor do carro");
            System.out.println("4. Mostrar a velocidade do carro");
            System.out.println("5. Mostrar o ano do carro");
            System.out.println("6. Editar a cor do carro");
            System.out.println("7. Editar o ano do carro");
            System.out.println("8. Mostrar dados do carro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch(opcao) {
                case 1:
                    meuCarro.venderCarro();
                    System.out.println("Carro vendido com sucesso!");
                    break;
                case 2:
                    System.out.println("Marca do carro: " + meuCarro.getMarca());
                    break;
                case 3:
                    System.out.println("Cor do carro: " + meuCarro.getCor());
                    break;
                case 4:
                    System.out.println("Velocidade do carro: " + meuCarro.getVelocidade() + " Km/h");
                    break;
                case 5:
                    System.out.println("Ano do carro: " + meuCarro.getAno());
                    break;
                case 6:
                    System.out.print("Digite a nova cor do carro: ");
                    String novaCor = scanner.nextLine();
                    meuCarro.alterarCor(novaCor);
                    System.out.println("Cor alterada com sucesso!");
                    break;
                case 7:
                    System.out.print("Digite o novo ano do carro: ");
                    int novoAno = scanner.nextInt();
                    meuCarro.alterarAno(novoAno);
                    System.out.println("Ano alterado com sucesso!");
                    break;
                case 8:
                    System.out.print("---- Dados do carro ----- ");
                    System.out.println(meuCarro.toString());
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println("\n" + meuCarro.toString());

        } while(opcao != 0);

        scanner.close();
    }
}
