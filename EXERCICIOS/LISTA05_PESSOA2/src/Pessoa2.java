import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pessoa2 {
    int idade;
    int dia;
    int mes;
    int ano;
    String nome;
    LocalDate nascimento;

    LocalDate hoje = LocalDate.now();

    public Pessoa2() {
    }

    public Pessoa2(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
        this.nascimento = LocalDate.of(ano, mes, dia);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
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

    public String informarNome() {
        return this.nome;
    }


}
