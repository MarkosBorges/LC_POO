package model;

import java.text.NumberFormat;

public class Gerente extends Funcionario{

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
                " Nome='" + getNome() + '\'' +
                ", Salário: " + NumberFormat.getCurrencyInstance().format(getSalario()) +
                " Total com BÔNUS: " + NumberFormat.getCurrencyInstance().format(salarioTotal) +
                '}';
    }


}
