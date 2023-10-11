package model;

import controller.FuncionarioController;

import java.text.NumberFormat;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        double salarioTotal = getSalario() + getBonus();
        return "\nDesenvolvedor{" +
                " Nome: '" + getNome() + '\'' +
                ", Salario : " + NumberFormat.getCurrencyInstance().format(getSalario()) +
                " Total com BÔNUS: " + NumberFormat.getCurrencyInstance().format(salarioTotal) +
                '}';
    }

}
