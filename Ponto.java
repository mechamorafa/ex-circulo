public class Ponto {
    
    private double coordX;
    private double coordY;

    public Ponto() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Ponto(double umX, double umY) {
        this.coordX = umX;
        this.coordY = umY;
    }

    public void move (double novoX, double novoY){
        this.coordX = novoX;
        this.coordY = novoY;
    }

    public double getX() {
        return coordX;
    } 

    public double getY() {
        return coordY;
    } 

    /*public String toString() {
        return 
    }*/


}
