package model;

public class Aviao extends Personagem{
    private double z=0;

    public Aviao(){
        super();
    }

    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("\nDesenhou Avião");

    }

    public void mover(double x, double y, double z){
        System.out.println("Moveu o Avião 3D");
        this.x = z;
        this.y = y;
        this.z = z;
    }

    // Sobrescreve o comportamento da superclasse Personagem
    @Override
    public String toString() {
        return "\n\nAviao{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
