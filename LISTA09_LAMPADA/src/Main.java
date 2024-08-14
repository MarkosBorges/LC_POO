public class Main {
    public static void main(String[] args) {

        System.out.println("========= LAMPADA =========");
        Lampada l1 = new Lampada();

        l1.imprimir();
        l1.setLigada( true );
        l1.imprimir();
    }
}