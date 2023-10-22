package model;

public abstract class Personagem {

    protected double x=0, y=0;

    public Personagem() {
    }

    public Personagem(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        System.out.println("Moveu um Personagem 2D.");
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();
    @Override
    public String toString() {
        return "\n\nPersonagem{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
