package model;

public class Tanque extends Personagem{

    public Tanque() {
        super();
    }

    public Tanque(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou Tanque");
    }

    @Override
    public String toString() {
        return "\n\nTanque{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
