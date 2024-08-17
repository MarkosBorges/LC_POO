public class Lampada {

    private boolean estadoDaLampada;
    private int potencia;
    private int luz;
    private static int consumoTotal =0;
    private static int lampadasAcesas = 0;
    private static int totalDeLampadas =0;


    public Lampada(boolean estado, int pot) {
        this.estadoDaLampada = estado;
        this.potencia = pot;
        consumoTotal += this.potencia;
    }


    public Lampada() {
        this.estadoDaLampada = false;
        this.potencia = 60;
        consumoTotal += this.potencia;
        totalDeLampadas +=1;
    }


    public void acende() {
        this.estadoDaLampada = true;
        lampadasAcesas += 1;
        totalDeLampadas +=1;
    }


    public void apaga() {
        this.estadoDaLampada = false;
        //lampadasAcesas -= 1;
        totalDeLampadas +=1;
    }


    public boolean mostraEstado() {
        return this.estadoDaLampada;
    }


    public boolean eEconomica() {
        return this.potencia <= 40;
    }

    public void imprimir(){

        System.out.println("\n==========================\nConsumo total: " + consumoTotal +" Watts "+ "\nNº total de lampadas: "+totalDeLampadas+ "\nNº de lampadas acesas: "+lampadasAcesas);

    }


    @Override
    public String toString() {
        String estado = estadoDaLampada ? "Ligada" : "Desligada";
        String economica;// = eEconomica() ? "Econômica" : "Não Econômica";
        if(eEconomica() == true){
            economica = "Sim";
        }else{
            economica = "Nao";
        }

        return "Potência: " + this.potencia + "W\nEstado: " + estado + "\nÉ econômica? " + economica;

    }
    //Fonte: https://www.delftstack.com/pt/howto/java/java-question-mark-colon/#google_vignette
}