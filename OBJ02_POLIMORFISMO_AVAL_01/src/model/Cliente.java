package model;

import java.util.function.Function;

public class Cliente implements Associado {
    private String nome;
    private int qtdCotas;


    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double lucros(int qtdCotas, double valorCota) {
        this.qtdCotas = qtdCotas;
        return qtdCotas * valorCota * 0.5;
    }

    public int getQtdCotas() {
        return qtdCotas;
    }

    @Override
    public String toString() {
        return "\nCliente{" +
                "Nome: '" + nome + '\'' +
                ", Quantidade de Cotas: " + qtdCotas +
                '}';
    }
}
