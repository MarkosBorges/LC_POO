public class Lampada {

    private boolean estadoDaLampada;
    private int potencia;


    public Lampada(boolean estado, int pot) {
        this.estadoDaLampada = estado;
        this.potencia = pot;
    }


    public Lampada() {
        this.estadoDaLampada = false; // Desligada por padrão
        this.potencia = 60;           // Potência padrão de 60 Watts
    }


    public void acende() {
        this.estadoDaLampada = true;
    }


    public void apaga() {
        this.estadoDaLampada = false;
    }


    public boolean mostraEstado() {
        return this.estadoDaLampada;
    }


    public boolean eEconomica() {
        return this.potencia <= 40;
    }


    @Override
    public String toString() {
        String estado = estadoDaLampada ? "Ligada" : "Desligada";
        String economica = eEconomica() ? "Econômica" : "Não Econômica";
        return "Potência: " + this.potencia + "W\nEstado: " + estado + "\n" + economica;
    }
}
