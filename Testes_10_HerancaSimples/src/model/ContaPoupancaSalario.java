package model;

public class ContaPoupancaSalario extends Conta{



    @Override
    public String toString() {
        return "\nConta Poupança Salário\n" +
                "Seu saldo atual é: R$" + getSaldo();
    }
}
