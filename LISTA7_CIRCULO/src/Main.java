//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("========== CIRCULO ==========");
        Circulo c1 = new Circulo(5,5);
        System.out.println(c1.getCoordX());
        System.out.println(c1.getCoordY());
        System.out.println(c1.getArea());

        System.out.println("======== AREA DO CIRCULO ======");
        System.out.println(c1.area());
        System.out.println();

    }
}