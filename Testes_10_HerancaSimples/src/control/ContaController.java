package control;

import model.ContaCorrente;
import model.ContaPoupanca;

public class ContaController {
    public static void main(String[] args) {

        System.out.println("========== CONTA =========");
        ContaCorrente contaCorr = new ContaCorrente();
        ContaPoupanca contaPoup = new ContaPoupanca();

        contaCorr.deposito(1000.00);
        //System.out.println("\nSeu saldo CORRENTE é: "+contaCorr.getSaldo());
        System.out.println(contaCorr);
        contaPoup.deposito(500.00);
        //System.out.println("\nSeu saldo da POUPANÇA é: "+contaPoup.getSaldo());
        System.out.println(contaPoup);


    }
}