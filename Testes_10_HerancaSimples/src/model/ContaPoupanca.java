package model;

public class ContaPoupanca extends Conta{



    @Override
    public String toString() {
        return "\nConta Poupanca \n" +
                "Seu saldo atual é: R$" + getSaldo();
    }
}
