import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Date data = new Date();
        int diaDate, mesDate, anoDate, idade, idade2;

        LocalDate hoje=LocalDate.now();
        diaDate = hoje.getDayOfMonth();
        mesDate = hoje.getMonthValue();
        anoDate = hoje.getYear();

        Pessoa pessoa1 = new Pessoa(10,10,1950,"Marcos");

        //idade = pessoa1.calcularIdade(pessoa1.getDia(), pessoa1.getMes(), pessoa1.getAno());
        idade2 = pessoa1.informarIdade();
        System.out.println("========= INFORMA IDADE ========");
        System.out.println("Nome: "+pessoa1.informarNome());
        System.out.println("Dia: "+pessoa1.getDia());
        System.out.println("Mês: "+pessoa1.getMes());
        System.out.println("Ano: "+pessoa1.getAno());

        //System.out.println("Idade: "+ (anoDate - pessoa1.ano));
        System.out.println("Idade: "+idade2);

        //Ajusta idade
        pessoa1.setDia(22);
        pessoa1.setMes(11);
        pessoa1.setAno(1995);
        System.out.println("\n\n======== AJUSTA IDADE ========");
        System.out.println("Nome: "+pessoa1.informarNome());
        System.out.println("Dia: "+pessoa1.getDia());
        System.out.println("Mês: "+pessoa1.getMes());
        System.out.println("Ano: "+pessoa1.getAno());
        System.out.println("Idade: "+idade2);
    }
}