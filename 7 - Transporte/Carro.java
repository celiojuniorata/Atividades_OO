public class Carro extends Transporte {
    
    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("Dirigindo a uma velocidade de " + velocidadeMaxima + " km/h");;
    }
    
}
