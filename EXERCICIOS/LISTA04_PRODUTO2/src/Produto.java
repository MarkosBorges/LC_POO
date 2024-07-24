public class Produto {

    // Declaração do(s) atributo(s)
    public String descricao; // descrição do produto
    public int quant; // quantidade do produto em estoque
    public double precoUnit; // preço unitário do produto

    public Produto(){}

    public Produto(String descricao, int quant, double precoUnit) {
        this.descricao = descricao;
        this.quant = quant;
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
        if ((quantRet > 0) && (quantRet <= quant)){
            quant = quant - quantRet;
            return true;
        }
        else {
            return false;
        }
    }


    /* Método para retornar o valor total do estoque considerando a
    quantidade existente e o preço unitário do produto. */
    public double obtemValorEstoque() {
        return (quant * precoUnit);
    }

    //-------------------
    @Override
    public String toString() {
        return "\nProduto{" +
                "Descricao: '" + descricao + '\'' +
                ", Quantidade em Estoque: " + quant +
                ", Valor: " + precoUnit +
                '}';
    }
}
