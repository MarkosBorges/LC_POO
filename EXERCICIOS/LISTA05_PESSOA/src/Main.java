import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int idade;

        Pessoa pessoa1 = new Pessoa(10,10,1950,"Marcos");

        idade = pessoa1.calcularIdade(pessoa1.getDia(), pessoa1.getMes(), pessoa1.getAno());

        System.out.println("========= INFORMA IDADE ========");
        System.out.println("Nome: "+pessoa1.informarNome());
        System.out.println("Dia: "+pessoa1.getDia());
        System.out.println("Mês: "+pessoa1.getMes());
        System.out.println("Ano: "+pessoa1.getAno());

        //System.out.println("Idade: "+ (anoDate - pessoa1.ano));
        System.out.println("Idade: "+idade);

        //Ajusta idade
        pessoa1.ajustarIdade(22,11,1995);
//        pessoa1.setDia(22);
//        pessoa1.setMes(11);
//        pessoa1.setAno(1995);
        pessoa1.ajustarIdade(pessoa1.getDia(), pessoa1.getMes(), pessoa1.getAno());
        idade = pessoa1.calcularIdade(pessoa1.getDia(),pessoa1.getMes(),pessoa1.getAno());
        System.out.println("\n\n======== AJUSTA IDADE ========");
        System.out.println("Nome: "+pessoa1.informarNome());
        System.out.println("Dia: "+pessoa1.getDia());
        System.out.println("Mês: "+pessoa1.getMes());
        System.out.println("Ano: "+pessoa1.getAno());
        System.out.println("Idade: "+idade);
    }
}