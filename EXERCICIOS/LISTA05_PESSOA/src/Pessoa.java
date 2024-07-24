import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    int idade;
    int dia;
    int mes;
    int ano;
    String nome;
    LocalDate nascimento;

    LocalDate hoje = LocalDate.now();


    public Pessoa() {
    }

    public Pessoa(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.nascimento = LocalDate.of(ano, mes, dia);
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
    // UTILIZADO METODO BETWEEN PARA CALCULAR O NASC
    //FONTE: https://acervolima.com/metodo-de-ponto-entre-em-java-com-exemplos/
    public int calcularIdade(int dia, int mes, int ano) {

        if ((nascimento != null) && (hoje != null)) {
            return this.idade = Period.between(nascimento, hoje).getYears();
        } else {
            return 0;
        }
    }

    public int informarIdade() {
        return this.idade;
    }

    public String informarNome() {
        return this.nome;
    }

    public void ajustarIdade(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.nascimento = LocalDate.of(ano,mes,dia);
        this.idade = calcularIdade(dia, mes, ano);
    }

}
