package model;

public abstract class Conta {
    protected double saldo=0.0;



    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "Saldo: " + saldo +
                '}';
    }
}
