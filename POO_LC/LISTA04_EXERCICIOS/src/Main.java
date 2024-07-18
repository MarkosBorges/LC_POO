import javax.swing.*;
import java.text.MessageFormat;

//Ref: https://www.bosontreinamentos.com.br/java/como-exibir-message-dialog-e-input-dialog-com-swing-em-java/

public class Main {
    public static void main(String[] args) {

        Terreno t1 = new Terreno();
        String temp;
        double area;
        StringBuilder mensagem = new StringBuilder();

        temp = JOptionPane.showInputDialog("Informe a largura do terreno: ");
        t1.largura = Double.parseDouble(temp);

        temp = JOptionPane.showInputDialog("Informe a altura do terreno: ");
        t1.comprimento = Double.parseDouble(temp);

        area = t1.obtemArea();

        System.out.println();
        System.out.println("Largura: "+ t1.largura);
        System.out.println("Comprimento: "+ t1.comprimento);
        System.out.println();
        mensagem.append("Área: ").append(area);
        JOptionPane.showMessageDialog(null, mensagem);
        System.out.println("Valor: "+area);

    }
}