package model;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {//contrutor de nome e salario
        this.nome = nome;
        this.salario = salario;
    }

    //NOME----------------------------------
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    //SALARIO--------------------------------
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }

    //BONUS----------------------------------
    public abstract double getBonus();//Deixei em abstract


}
