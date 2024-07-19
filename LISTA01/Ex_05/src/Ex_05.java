import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a coordenada X do primeiro ponto:");
        double x1 = scanner.nextDouble();
        System.out.println("Digite a coordenada Y do primeiro ponto:");
        double y1 = scanner.nextDouble();

        System.out.println("Digite a coordenada X do segundo ponto:");
        double x2 = scanner.nextDouble();
        System.out.println("Digite a coordenada Y do segundo ponto:");
        double y2 = scanner.nextDouble();

        // Cálculo da distância ----------------------------------------------------
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));


        System.out.printf("A distância entre os pontos é de: %.2f\n", distancia);

    }
}
