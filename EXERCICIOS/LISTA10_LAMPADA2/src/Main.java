public class Main {

    public static void main(String[] args) {
        System.out.println("========= LAMPADA =========");
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada(true, 40);
        Lampada lampada3 = new Lampada(false, 100);


        System.out.println("Lâmpada 1: " + lampada1.toString());
        System.out.println("\n\nLâmpada 2: " + lampada2.toString());
        System.out.println("\n\nLâmpada 3: " + lampada3.toString());


        lampada1.acende();
        lampada2.apaga();


        //System.out.println("\nAcendendo a lâmpada 1 e apagando a lâmpada 2:");
        //System.out.println("Lâmpada 1: " + lampada1.toString());
        //System.out.println("Lâmpada 2: " + lampada2.toString());


        //System.out.println("\nLâmpada 1 é econômica? " + lampada1.eEconomica());
        //System.out.println("Lâmpada 2 é econômica? " + lampada2.eEconomica());
        //System.out.println("Lâmpada 3 é econômica? " + lampada3.eEconomica());


        System.out.println("\n=========== CONTAGEM ============");
        lampada1.imprimir();
        lampada2.imprimir();
        lampada3.imprimir();

    }
}