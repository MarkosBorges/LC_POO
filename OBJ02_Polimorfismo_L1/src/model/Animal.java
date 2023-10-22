package model;

public abstract class Animal {
    protected double x=0,y=0;

    public Animal(){
    }

    public Animal(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void mover(double y, double x){
        System.out.println("Moveu o Animal");
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();

    @Override
    public String toString() {
        return "Animal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
