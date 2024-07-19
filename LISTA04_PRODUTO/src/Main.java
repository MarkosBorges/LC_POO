import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        Produto p1 = new Produto("Mouse",20,29.90);
//        System.out.println(p1.descricao);
//        System.out.println(p1.precoUnit);
//        System.out.println(p1.quant);

        String tempNome;
        Double tempPreco;
        int tempQuant;
        Produto p2 = new Produto();

        tempNome = JOptionPane.showInputDialog("Informe o nome ou descrição do produto: ");
        p2.setDescricao(tempNome);
        tempPreco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        p2.setPrecoUnit(tempPreco);
        tempQuant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto: "));
        p2.setQuant(tempQuant);

        System.out.println("Descrição do Produto: "+p2.getDescricao());
        System.out.println("Preço: "+p2.getPrecoUnit());
        System.out.println("Estoque: "+p2.getQuant());
        p2.setQuant(-100);
        System.out.println(p2.getQuant());
        System.out.println(" O valor total do estoque considerando a quantidade existente e o preço unitário do produto: "+p2.obtemValorEstoque());


        int repoeEstoq = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade para REPOR: "));
        p2.repoe(repoeEstoq);
        System.out.println("=====================================");
        System.out.println("Quantidade atual: " + p2.getQuant());
        System.out.println("=====================================");



        int retiraEstoq = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade para RETIRAR: "));
        boolean retirou = p2.retira(retiraEstoq);
        System.out.println("=====================================");
        System.out.println("Quantidade atual: " + p2.getQuant());
        JOptionPane.showMessageDialog(null, "Algo foi retirado do estoque? "+ retirou);
        if(retirou = true){
            JOptionPane.showMessageDialog(null, "Quantidade retirada: "+retiraEstoq);
        }else{
            System.out.println("NADA retirado do estoque!");
        }
        //System.out.println("Quantidade retidada: "+ p2.getQuant());
        System.out.println("=====================================");

        System.out.println("FIM!");

    }
}
