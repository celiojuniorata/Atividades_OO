public class Aviao extends Transporte {
    
    public Aviao(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("Voando a uma velocidade de " + velocidadeMaxima + " km/h");
    }
    
}
