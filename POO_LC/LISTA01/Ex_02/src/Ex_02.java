import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int z;
        int soma;
        int contador;

        System.out.println("------ Exercício 02 ------");
        System.out.print("Digite um valor para X: ");
        x = scanner.nextInt();
        do {
            System.out.print("Digite um valor para Z: ");
            z = scanner.nextInt();
        } while (z <= x);


        soma = x;
        contador = 1;
        while (soma <= z) {
            soma += x + contador;
            contador++;
        }

        System.out.println("Quantidade de números inteiros necessários: " + contador);

        scanner.close();
    }
}
