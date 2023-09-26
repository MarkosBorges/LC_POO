package model;

public interface Investidor {

    //Não coloquei que é pública e abstrata por ser natural de uma interface
    String getTicker();
    void setTicker(String ticker);
    int getQuantidades();
    void setQuantidade(int quantidade);



}
