package model;

// Classe Bicicleta
public class Bicicleta extends Veiculo {
    private int tamanhoRoda;
    private String chassi;


    public Bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao,
                     int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    // Gets e sets > Bicicleta
    public int getTamanhoRoda() {
        return tamanhoRoda;
    }
    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

//    @Override
//    public String toString() {
//        return "BICICLETA " +
//                " Tamanho da Roda: " + tamanhoRoda +
//                ", Chassi: '" + chassi + '\'' +
//                '}';
//    }
}
