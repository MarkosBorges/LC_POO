package model;

// Classe Caminhao
public class Caminhao extends Veiculo implements Automovel {
    private int capacidadeDeCarga;
    private String renavam;
    private String chassi;
    private String placa;


    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao,
                    int capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    // Gets e sets > Caminhao
    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }


    // Implements da interface Automovel ---------------------------------
    @Override
    public String getRenavam() {
        return renavam;
    }

    @Override
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    @Override
    public String getChassi() {
        return chassi;
    }

    @Override
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //-------------- teste
//    @Override
//    public String toString() {
//        return "CAMINHÃO: " +
//                " Capacidade de Carga: " + capacidadeDeCarga +
//                ", Renavam: '" + renavam + '\'' +
//                ", Chassi: '" + chassi + '\'' +
//                ", Placa: '" + placa + '\'' +
//                '}';
//    }

}

