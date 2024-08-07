public class Circulo {
    private int coordX;
    private int coordY;
    private double raio;

    public Circulo(int x, int y, double r) {
        this.coordX = x;
        this.coordY = y;
        this.raio = r;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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
        //retorna a área do circulo
        return Math.PI * getRaio() * getRaio();
    }

    public double perimetro(){
        //retorna o perímetro do circulo
        return (2*Math.PI*getRaio());
    }

    public int obtemX(){
        return getCoordX();
    }
    public int obtemY(){
        return getCoordY();
    }
    public double obtemRaio(){ return getRaio(); }

    // Método para exibir as coordenadas do círculo e seu respectivo raio
    public String exibe(){
       String dados;
       dados = "Centro:"+getCoordX()+","+getCoordY()+"\nRaio: "+getRaio()+"\n";
       return dados;
    }

    // Método para fazer o translado do centro do círculo considerando os valores de deslocamentos fornecidos como argumentos.
    public void move(int x, int y) {
        this.coordX = getCoordX() + x;
        this.coordY = getCoordY() + y;
    }

    //Compara os circulos
    public int compara(Circulo c){
        if (getRaio() == c.getRaio()){
            return 0;
        }else {
           if (getRaio() < c.getRaio()){
               //Se o círculo que chamou o método possui um raio maior que o passado como argumnto
               return 1;
           } else {
               //Se o círculo que chamou o método possui um raio menor que o passado como argumento
               return -1;
           }
        }
    }

    //M[etodo para verificar se um ponto está localizado dentro do círculo
    public boolean estaDentro(int x, int y){
//        x = x - getCoordX();
//        y = y - getCoordY();
//
//        if (((x*x)+(y*y)) <= (getRaio()*getRaio()))
//            //O ponto está localizado dentro do círculo
//            return true;
//        else
//            // está localizado fora do círculo
//            return false;
        int dx = x - getCoordX();
        int dy = y - getCoordY();
        return (dx * dx + dy * dy) <= (getRaio() * getRaio());

    }

}
