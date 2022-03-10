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

    public double getX() {
        return coordX;
    } 

    public double getY() {
        return coordY;
    } 


}
