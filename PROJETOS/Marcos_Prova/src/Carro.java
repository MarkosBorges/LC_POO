public class Carro {
    private String marca;
    private String cor;
    private int velocidade;
    private int ano;
    private boolean vendido;


    public Carro(String marca, String cor, int velocidade, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
        this.ano = ano;
        this.vendido = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }


    public void venderCarro() {
        this.vendido = true;
    }

    public void alterarCor(String novaCor) {
        this.cor = novaCor;
    }

    public void alterarAno(int novoAno) {
        this.ano = novoAno;
    }

    @Override
    public String toString() {
        String status = vendido ? "==== VENDIDO ====" : "==== À VENDA! ====";
        return status +
                "\nMarca: " + marca +
                "  Cor: " + cor +
                "\n Ano: " + ano +
                " Velocidade: " + velocidade + " Km/h";
    }
}
