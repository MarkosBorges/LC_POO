package control;

import model.ContaConjunta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaPoupancaSalario;

public class ContaController {
    public static void main(String[] args) {

        System.out.println("========== CONTA =========");
        ContaCorrente contaCorr = new ContaCorrente();
        contaCorr.deposito(1000.00);
        //System.out.println("\nSeu saldo CORRENTE é: "+contaCorr.getSaldo());
        System.out.println(contaCorr);
        contaCorr.sacar(1100.00);
        System.out.println(contaCorr);

        ContaPoupanca contaPoup = new ContaPoupanca();
        contaPoup.deposito(500.00);
        //System.out.println("\nSeu saldo da POUPANÇA é: "+contaPoup.getSaldo());
        System.out.println(contaPoup);

        ContaConjunta contaConj = new ContaConjunta();
        contaConj.deposito(2000.00);
        System.out.println(contaConj);

        ContaPoupancaSalario contaPS = new ContaPoupancaSalario();
        contaPS.deposito(3000.00);
        System.out.println(contaPS);

    }
}