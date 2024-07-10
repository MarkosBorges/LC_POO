import java.util.Random;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random gerador = new Random();

        int numSorteado;
        int num;
        int cont =0;

        numSorteado = gerador.nextInt(10);;
        do {
            cont ++;
            System.out.println("Digite um número: ");
            num = in.nextInt();
            if(num < numSorteado){
                System.out.println("Numero abaixo");
            } else if (num > numSorteado) {
                System.out.println("Numero acima");
            } else if (num == numSorteado) {
                System.out.println("Acertou!");
            }
        }while (num != numSorteado);

        System.out.println("==================================");
        System.out.println("O valor sorteado é: " + numSorteado);
        System.out.println("O numero de tentativas foi: " + cont);
        System.out.println("===================================");

    }
}