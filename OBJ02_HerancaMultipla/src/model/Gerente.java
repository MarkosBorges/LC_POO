package model;

import java.text.NumberFormat;

public class Gerente extends Funcionario implements Investidor{

    private String ticker;
    private int quantidade;

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        double salarioTotal = getSalario() + getBonus();
        return "\nGerente{" +
                " Ticker: " + ticker + " Quantidade: " + quantidade +  '\'' +
                " Nome: '" + getNome() + '\'' +
                ", Salário: " + NumberFormat.getCurrencyInstance().format(getSalario()) +
                " Total com BÔNUS: " + NumberFormat.getCurrencyInstance().format(salarioTotal) +
                '}';
    }

//-------------------------------------------------------
    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;//valor que chega de entrada na porta do método
    }

    @Override
    public int getQuantidades() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
