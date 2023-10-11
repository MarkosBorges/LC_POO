package model;

public class Carro extends Veiculo implements Automovel {

    private int capacidadePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;


    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    // --------------------------------------
    // Get e set portamalas -----------------
    public int getCapacidadePortaMalas() {

        return capacidadePortaMalas;
    }
    public void setCapacidadePortaMalas(int capacidadePortaMalas) {

        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    // ----------------------------------------------------
    // Implements Automovel --------------------------------
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


//    @Override
//    public String toString() {
//        return "CAROO " +
//                " Capacidade Porta Malas: " + capacidadePortaMalas +
//                ", Renavam: '" + renavam + '\'' +
//                ", Chassi: '" + chassi + '\'' +
//                ", Placa: '" + placa + '\'' +
//                '}';
//    }
}
