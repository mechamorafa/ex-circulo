public class App {
    public static void main(String args[]){
        Circulo c1;
        c1 = new Circulo();
        System.out.println("\n circulo c1");
        System.out.println(c1.toString());

        Circulo c2 = new Circulo(3, 4, 7);
        System.out.println("\n circulo c2");
        System.out.println(c2.toString());


        c2.move(8,10);
        System.out.println("\n circulo c2 moveu");
        System.out.println(c2.toString());

        double resultado = c2.area();
        System.out.println("\n Área do circulo C2: " + resultado);
        
        c2.zoom(10);
        System.out.println("\n circulo c2 zoom:");
        System.out.println(c2.toString());


        // Lista de circulos. 
        Circulo[] lista = new Circulo[3];

        lista[0] = c1;
        lista[1] = c2;
        lista[2] = new Circulo(3,3,3);

        System.out.println("\n Lista de Circulos com for: ");
                
        for(int i=0; i<lista.length; i++){
            Circulo aux = lista[i];
            System.out.println(aux.toString());
        }

        System.out.println("\n Lista de Circulos com for each: ");
        for(Circulo aux : lista){
            System.out.println(aux.toString());
        }

    }
}
