package model;

public class ContaCorrente extends Conta{

    @Override
    public void sacar(double valor){
        double saldoAtual = this.saldo - valor;
        if (saldoAtual >= -200) {
            this.saldo -= valor;
        }else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

    @Override
    public String toString() {
        return "\nConta Corrente \n" +
                "Seu saldo atual é: R$" + getSaldo();
    }
}
