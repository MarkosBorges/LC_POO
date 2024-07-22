import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Date data = new Date();
        int diaDate, mesDate, anoDate;

        LocalDate hoje=LocalDate.now();
        diaDate = hoje.getDayOfMonth();
        mesDate = hoje.getMonthValue();
        anoDate = hoje.getYear();

        Pessoa pessoa1 = new Pessoa(10,10,10,1950,"Marcos");

        System.out.println(pessoa1.idade);
        System.out.println(pessoa1.dia);
        System.out.println(pessoa1.mes);
        System.out.println(pessoa1.ano);
        System.out.println(pessoa1.nome);

        System.out.println(anoDate - pessoa1.ano);


    }
}