public class Produto{

    private String descricao;
    private int quant;
    private double precoUnit;


    public Produto(){};

    public Produto(String descricao, int quant, double precoUnit) {
        this.descricao = descricao;
        this.quant = quant;
        this.precoUnit = precoUnit;
    }

    //GET e SET
    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        int novoEstoque = this.quant + quant;
        if (novoEstoque > 0){
            this.quant = quant;
            System.out.println("Estoque atualizada com sucesso!");
            System.out.println("Novo estoque tem: " + this.quant +" itens");
        }else{
            System.out.println("Estoque NÃO ATUALIZOU!");
        }
    }

    //-------------------------------
    public void repoe(int quantReposicao){
        if(quantReposicao > 0){
            this.quant += quantReposicao;
        }else{
            System.out.println("Digite um valor positivo!");
        }
        //System.out.println("Retorna repoe");
        //return 0;
    }
    public boolean retira(int quantRet){
        if (quantRet > 0 && quantRet <= this.quant) {
            this.quant -= quantRet;
            return true;
        }
        return false;
        //System.out.println("Retorna retira"+quantRet);
    }

    public double obtemValorEstoque(){
        return this.quant * this.precoUnit;
    }
}