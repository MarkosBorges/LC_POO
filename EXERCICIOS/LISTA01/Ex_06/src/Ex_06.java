import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== PROGRAMA TRIÂNGULO =====");
        System.out.println("Digite o tamanho do lado 1 do triângulo: ");
        double lado1 = input.nextDouble();

        System.out.println("Digite o tamnho do lado 2 do triângulo: ");
        double lado2 = input.nextDouble();

        System.out.println("Digite o tamanho do lado 3 do triângulo: ");
        double lado3 = input.nextDouble();

        if(lado1 == lado2 && lado2 == lado3) {
            System.out.println("Esse é um Triângulo Equilátero");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Esse é um Triângulo Isósceles");
        } else {
            System.out.println("Esse é um Triângulo Escaleno");
        }
    }
}