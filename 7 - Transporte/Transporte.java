public abstract class Transporte {
    protected int velocidadeMaxima;

    public Transporte(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    protected abstract void mover();
}
