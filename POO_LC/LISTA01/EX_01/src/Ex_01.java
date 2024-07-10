import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int result = 0;
        System.out.println("EXERCICIO 01 - ");
        do {
            System.out.println("Digite um número: ");
            N = in.nextInt();
            if (N <=0){
                break;
            }

            while(result !=1) {
                if (N % 2 == 0) {
                    System.out.println("É par!");
                    result = N / 2;
                    //System.out.println("O resultado é: " + N + " " + result);
                } else {
                    System.out.println("É impar!");
                    result = ((3 * N) + 1);
                    //System.out.println("O resultado é: " + N + " " + result);
                }
                System.out.println(result);
            }
        }while (result > 0);
    }
}