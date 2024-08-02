public class Circulo {
    private int coordX;
    private int coordY;
    private double area;

    public Circulo(int x, int y, double r) {
        this.coordX = x;
        this.coordY = y;
        this.area = r;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }
// ===========================================

    public double area(){
        //quantRet =  area* area;
        return Math.PI *area *area;
    }

    public double perimetro(){
        return 0;
    }

    public int obtemX(){
        return 0;
    }
    public int obtemY(){
        return 0;
    }
    public int obtemRaio(){
        //this.coordY = y;
        //this.coordX = x;
        return (this.coordX+this.coordY);
    }
    public void exibe(){
        System.out.println();
    }

    public boolean estaDentro(int x, int y) {
        return false;
    }
}
