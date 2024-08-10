import java.time.LocalTime;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 1;
    }

    public Relogio(int hora) {
        this.hora = hora;
        this.minuto = 1;
        this.segundo = 1;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    // ======================================================
    // Método para incrementar um segundo
    public void incrementa() {
        if (++this.segundo>59) {
            this.segundo = 0;
            if (++this.minuto>59) {
                this.minuto = 0;
                if (++this.hora>23)
                    this.hora = 0;
            }
        }
    }
    // Método para decrementar um segundo
    public void decrementa() {
        if (--this.segundo<0) {
            this.segundo = 59;
            if (--this.minuto<0) {
                this.minuto = 59;
                if (--this.hora<0)
                    this.hora = 23;
            }
        }
    }

    // ======================================================
    public void acertaHora(int hora, int minuto, int segundo){
        if (getHora() >= 0 && getHora() <= 23) {
            this.hora = hora;
        }
        else {
            this.hora = 0;
        }
        if (getMinuto() >= 0 && getMinuto() <= 59) {
            this.minuto = minuto;
        }
        else {
            this.minuto = 0;
        }
        if (getSegundo() >= 0 && getSegundo() <= 59) {
            this.segundo = segundo;
        }
        else {
            this.segundo = 0;
        }
    }

    public void acertaHora(int hora, int minuto){
        if (getHora() >= 0 && getHora() <= 23) {
            this.hora = hora;
        }
        else {
            this.hora = 0;
        }
        if (getMinuto() >= 0 && getMinuto() <= 59) {
            this.minuto = minuto;
        }
        else {
            this.minuto = 0;
        }
        this.segundo = 1;
    }

    public void acertaHora(int hora){
        if (getHora() >= 0 && getHora() <= 23) {
            this.hora = hora;
        }
        else {
            this.hora = 0;
        }
        this.minuto = 1;
        this.segundo = 1;
    }

    public void mostraHoraAtual(){
        // Para obter a hora atual:
        var horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual); // Exemplo: 14:02:10

        // Para criar uma hora específica:
        var horaEspecifica = LocalTime.of(15, 30, 0); // Hora, minuto, segundo
        System.out.println("Hora específica: " + horaEspecifica); // Exemplo: 15:30:00
    }

    @Override
    public String toString() {
        return "\nHORA CERTA\n" +
                getHora()+" horas " +
                 getMinuto()+" minutos " + +
                getSegundo()+" segundos ";
    }

}

