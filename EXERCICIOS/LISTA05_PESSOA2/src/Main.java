import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int idadeAlbert,idadeNewton;

        Locale br = new Locale("pt", "BR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", br);
        LocalDate hoje = LocalDate.now();
        String dataFormatada = hoje.format(formatter);

        Pessoa2 albert = new Pessoa2(14,3,1879,"Albert Einstein");
        Pessoa2 isaac = new Pessoa2(4,1,1643,"Isaac Newton");

        idadeAlbert = albert.calcularIdade(albert.getDia(), albert.getMes(), albert.getAno());
        idadeNewton = isaac.calcularIdade(isaac.getDia(), isaac.getMes(), isaac.getAno());

        System.out.println("========= IDADE ALBERT ========");
        System.out.println("Nome: "+albert.informarNome());
        System.out.println("Data de Nascimento: "+albert.getDia()+"/"+albert.getMes()+"/"+albert.getAno());
        System.out.println("Idade dele no dia de hoje (caso tivessem vivos): "+idadeAlbert+" anos");
        System.out.println("Data de Hoje: "+dataFormatada);
        System.out.println();
        System.out.println("========= IDADE NEWTON ========");
        System.out.println("Nome: "+isaac.informarNome());
        System.out.println("Data de Nascimento: "+isaac.getDia()+"/"+isaac.getMes()+"/"+isaac.getAno());
        System.out.println("Idade dele no dia de hoje (caso tivessem vivos): "+idadeNewton+ " anos");
        System.out.println("Data de Hoje: "+dataFormatada);

    }
}