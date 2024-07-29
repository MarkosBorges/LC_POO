package model;

public class Conta {

    private double saldo;
    public double getSaldo;

    public Conta() {

    }

    public Conta(double saldo, double getSaldo) {
        this.saldo = saldo;
        this.getSaldo = getSaldo;
    }


    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                ", getSaldo=" + getSaldo +
                '}';
    }

    // ========================================================
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getGetSaldo() {
        return getSaldo;
    }

    public void setGetSaldo(double getSaldo) {
        this.getSaldo = getSaldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo += valor;
    }

    public void atualiza(double taxa) {
        this.saldo += taxa;
    }

}
