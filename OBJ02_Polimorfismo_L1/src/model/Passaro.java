package model;

public class Passaro extends Animal{
    private double z=0;

    public Passaro() {
        super();
    }

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("\nDESENHA PÁSSARO");
    }

    public void mover(double x, double y, double z){
        System.out.println("Moveu Pássaro");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPássaro: -> {" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
