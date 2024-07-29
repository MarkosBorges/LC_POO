package model;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {//construtor padrao
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        double newSalario = this.salario + salario;
        if (this.salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("==== ERRO! Menos de R$0,00 ====");
        }
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "Nome='" + nome + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
