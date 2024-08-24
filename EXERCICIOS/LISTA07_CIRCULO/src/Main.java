import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double raioUm, raioDois;


        raioUm = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do Circulo 1"));
        raioDois = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio do Circulo 2"));


        Circulo circUm = new Circulo(0, 0, raioUm);
        Circulo circDois = new Circulo(10, 30, raioDois);

        // áreas dos  círculos
        JOptionPane.showMessageDialog(null, "Área do Circulo 1: " + circUm.area() + "\n" + "Área do Circulo 2: " + circDois.area());

        // Verifica se é maior que a área do segundo
        System.out.println("============== CIRCULO MAIOR ==============");
        if (circUm.area() > circDois.area()) {
            JOptionPane.showMessageDialog(null, "Perímetro do Circulo 1: " + circUm.perimetro());
        } else {
            JOptionPane.showMessageDialog(null, "Perímetro do Circulo 2: " + circDois.perimetro());
        }

        // Testes adicionais
        System.out.println("\n\n========== TESTES ==========");
        testesCirculos();
    }

    public static void testesCirculos() {

        Circulo c1 = new Circulo(0, 0, 5);
        Circulo c2 = new Circulo(10, 10, 3);
        Circulo c3 = new Circulo(-5, -5, 5);

        // Testando o area
        System.out.println("Área do círculo 1: " + c1.area());
        System.out.println("Área do círculo 2: " + c2.area());

        // Testando o perimetro
        System.out.println("Perímetro do círculo 1: " + c1.perimetro());
        System.out.println("Perímetro do círculo 2: " + c2.perimetro());

        // Testando o exibe
        System.out.println("Informações do círculo 1:\n" + c1.exibe());
        System.out.println("Informações do círculo 2:\n" + c2.exibe());

        // Testando o move
        c1.move(2, 3);
        System.out.println("Informações do círculo 1 após mover:\n" + c1.exibe());

        // Testando o compara
        System.out.println("Comparando círculo 1 com círculo 2: " + c1.compara(c2)); // retornar 1
        System.out.println("Comparando círculo 1 com círculo 3: " + c1.compara(c3)); // retornar 0

        // Testando o estaDentro
        System.out.println("O ponto (2, 3) está dentro do círculo 1? " + c1.estaDentro(2, 3)); //  true
        System.out.println("O ponto (10, 10) está dentro do círculo 1? " + c1.estaDentro(10, 10)); //  false
    }
}
