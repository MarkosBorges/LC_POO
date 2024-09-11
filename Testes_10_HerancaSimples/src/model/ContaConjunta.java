package model;

public class ContaConjunta extends Conta{



    @Override
    public String toString() {
        return "\nConta Conjunta \n" +
                "Seu saldo atual é: R$" + getSaldo();
    }
}
