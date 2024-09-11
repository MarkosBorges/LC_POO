package model;

public class ContaCorrente extends Conta{

    @Override
    public String toString() {
        return "\nConta Corrente \n" +
                "Seu saldo atual é: R$" + getSaldo();
    }
}
