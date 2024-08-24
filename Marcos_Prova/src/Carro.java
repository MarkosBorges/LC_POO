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
        this.vendido = true;
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

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public void vendido() {
        this.vendido = true;
    }


    public void naoVendido() {
        this.vendido = false;
    }

    public boolean vendeCarro(){
        return this.vendido;
    }

    public String alteraCor(String cor){
        this.cor = cor;
        //return null;
        return cor;
    }

//    private String setCor() {
//        this.cor = cor;
//        return getCor();
//    }

    public int alteraAno(int ano){
        this.ano = ano;
        //return cor;
        return 0;
    }
    @Override
    public String toString() {
        String estado = vendido ? "Vendido" : "Não Vendido";
        String status;
        if(vendeCarro() == true){
            status = "==== VENDIDO ====";
        }else{
            status = "==== À VENDA! ====";
        }
        return " " + status +
                "\nMarca: " + marca + '\'' +
                "  Cor: " + cor + '\'' +
                "\n Ano: " + ano +
                " Velocidade: " + velocidade;
    }
}
