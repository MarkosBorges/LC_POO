package model;

public class ContaPoupanca extends Conta {
//    public ContaPoupanca() {
//        super();
//    }
//
//    @Override
//    public void deposita(double valor) {
//        System.out.println("Depositou na Conta Poupança.");
//        super.deposita(valor);
//    }
//
//    @Override
//    public void saca(double valor) {
//        System.out.println("Sacou da Conta Poupança.");
//        super.saca(valor);
//    }
//
//    @Override
//    public void atualiza(double taxa) {
//        System.out.println("Atualizou a Conta Poupança.");
//        super.atualiza(taxa);
//    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "Saldo: " + saldo +
                '}';
    }
}
