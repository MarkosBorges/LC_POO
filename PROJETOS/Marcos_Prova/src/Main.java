import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um carro de exemplo
        Carro meuCarro = new Carro("Toyota", "Preto", 180, 2020);

        int opcao = 0;

        do {
            System.out.println("\n====== Menu da Concessionária ======");
            System.out.println("1. - VENDER o carro -");
            System.out.println("2. Mostrar a MARCA do carro");
            System.out.println("3. Mostrar a COR do carro");
            System.out.println("4. Mostrar a VELOCIDADE do carro");
            System.out.println("5. Mostrar o ANO do carro");
            System.out.println("6. EDITAR a COR do carro");
            System.out.println("7. EDITAR o ANO do carro");
            System.out.println("8. MOSTRAR DADOS do carro");
            System.out.println("0. **SAIR**");
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
                    System.out.println("---- Dados do carro ----- ");
                    System.out.println(meuCarro.toString());
                    try {
                        Thread.sleep(8000);  // 5 segundos
                    } catch (InterruptedException e) {
                        System.out.println("Ocorreu um erro durante a espera.");
                    }
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
