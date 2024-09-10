package model;

public abstract class Conta {
    protected double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valor){
        this.saldo += this.saldo + valor;
    }

    public void saca(double valor) {
        if (valor > 0){
            this.saldo -= saldo;
        }

    }
}
