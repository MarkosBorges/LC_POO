import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String msg;
        System.out.println("========= RELOGIO ========");

        Relogio r1 = new Relogio(2,20,0);
        msg = r1.toString();
        System.out.println(msg);

        Relogio r2 = new Relogio(2,20);
        msg = r2.toString();
        System.out.println(msg);

        Relogio r3 = new Relogio(2);
        msg = r3.toString();
        System.out.println(msg);

        //===================================
        r1.setHora(11);
        r1.setMinuto(30);
        r1.setSegundo(10);
        System.out.println("\n===== R1 MODIFICADO! ======");
        System.out.println(r1.toString());

        //===================================

        var horaAtual = LocalTime.now();
        System.out.println("========= HORA ATUAL =========");
        var format = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora do sistema: " + horaAtual.format(format));
    }
}