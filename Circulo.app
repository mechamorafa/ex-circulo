public class Circulo {
    
    private Ponto centro;
    private double raio;

    public Circulo() {
        this.centro = new Ponto();
        this.raio = 1;
     }

    public Circulo (double umX, double umY, double raio){
        this.centro = new Ponto(umX, umY);
        this.raio = raio;
    }

    public void move (double novoX, double novoY){
        this.centro = new Ponto(novoX, novoY);
    }

    public void zoom (double fator){
        this.raio *= fator;
    }

    public double area (){
        //return Math.PI * Math.PI.pow(raio, 2);
        return Math.PI * raio * raio;

    }

    public String toString() {
        //return coordX + " " + coordY + " " + raio;
        return String.format("(%.2f, %.2f), r: %.2f",
                                centro.getX(), 
                                centro.getY(),
                                raio);
    }
    

}