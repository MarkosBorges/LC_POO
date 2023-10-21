package model;

public class Navio extends Personagem{
    public Navio() {
        super();
    }

    public Navio(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou Navio");
    }

    // Sobrescreve o comportamento da superclasse Personagem
    @Override
    public String toString() {
        return "\n\nNavio{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
