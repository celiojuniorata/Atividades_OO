public class Bicicleta extends Transporte {
    
    public Bicicleta(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("Pedalando a uma velocidade de " + velocidadeMaxima + " km/h");
    }   

    
}
