package model;

public class ContaCorrente extends Conta implements Associado {

//    public ContaCorrente() {
//        super();
//    }
//
//    @Override
//    public void deposita(double valor) {
//        System.out.println("Depositou na Conta Corrente.");
//        super.deposita(valor);
//    }
//
//    @Override
//    public void saca(double valor) {
//        System.out.println("Sacou da Conta Corrente.");
//        super.saca(valor);
//    }
//
//    @Override
//    public void atualiza(double taxa) {
//        System.out.println("Atualizou a Conta Corrente.");
//        super.atualiza(taxa);
//    }

    @Override
    public double lucros(int qtdCotas, double valorCota) {
        return qtdCotas * valorCota * 0.1;
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "Saldo: " + saldo +
                '}';
    }
}
