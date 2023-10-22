package model;

public class Peixe extends Animal {
    private double z=0;

    public Peixe(){
        super();
    }
    public Peixe(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public void desenhar() {
        System.out.println("\nDESENHA PEIXE");
    }

    public void mover(double y, double x, double z){
        System.out.println("Moveu o Peixe");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPeixe: -> {" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
