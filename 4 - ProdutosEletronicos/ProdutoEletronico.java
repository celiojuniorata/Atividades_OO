public abstract class ProdutoEletronico {
    
    protected String marca, modelo;

    public ProdutoEletronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void ligar();

    public abstract void mensagem();

}
