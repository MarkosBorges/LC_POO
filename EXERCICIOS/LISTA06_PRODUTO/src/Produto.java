public class Produto {
    // Declaração do(s) atributo(s)
    private String descricao; // descrição do produto
    private int quant; // quantidade do produto em estoque
    private double precoUnit; // preço unitário do produto

    public Produto(){}

    public Produto(String descricao, int quant, double precoUnit) {
        this.descricao = descricao;
        this.quant = quant;
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
        this.quant = quant;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    /* Método para atualizar o estoque com a quantidade passada como
    parâmetro. Caso a quantidade passada como parâmetro for zero ou
    negativa o estoque não deve ser atualizado */

    public void repoe(int quantRep) {
        if (quantRep > 0){
            quant = quant + quantRep;
        }
    }


    /* Método para atualizar o estoque com a quantidade passada como
    parâmetro. Caso a quantidade passada como parâmetro for zero,
    negativa ou superior ao estoque existente, a atualização não deve
    ser executada */
    public boolean retira(int quantRet) {
        if ((quantRet > 0) && (quantRet <= getQuant())){
            quant -= quantRet;
            return true;
        }
        else {
            return false;
        }
    }

    public void alteraPrecoUnitario(double novoPreco) {
        if (novoPreco > 0.0) {
            this.precoUnit += novoPreco;
            //System.out.println("Preço atualizado com sucesso!");
        }
    }


    /* Método para retornar o valor total do estoque considerando a
    quantidade existente e o preço unitário do produto. */
    public double obtemValorEstoque() {
        return (getQuant() * getPrecoUnit());
    }

    //-------------------
    @Override
    public String toString() {
        return "\nProduto{" +
                "Descricao: '" + getDescricao() + '\'' +
                ", Quantidade em Estoque: " + getQuant() +
                ", Valor: " + getPrecoUnit() +
                '}';
    }
}
