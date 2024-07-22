import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Pessoa {
    int idade;
    int dia;
    int mes;
    int ano;
    String nome;

    public Pessoa() {
    }

    public Pessoa(int idade, int dia, int mes, int ano, String nome) {
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

// ---------------------------------------------
    public void calcularIdade(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;


       // return ano - getAno();
    }
//    public int informarIdade(){
//
//
//    }

}
