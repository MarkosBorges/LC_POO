import java.text.NumberFormat;

public class Ex_04 {
    public static void main(String[] args) {
        int impares = 0;
        long pares = 1;
        NumberFormat formPar = NumberFormat.getCurrencyInstance();

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                //System.out.println("É par!");
                if (pares ==0){
                    pares = i;
                }else {
                    pares *= i;
                }
            }else {
                impares += i;
            }
        }

        System.out.println("===================================");
        System.out.println("A soma dos ímpares: " + impares);
        System.out.println("A multiplicação dos pares: " + (pares));
        System.out.println("===================================");

    }
}