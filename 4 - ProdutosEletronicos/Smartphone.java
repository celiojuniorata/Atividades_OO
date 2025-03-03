public class Smartphone extends ProdutoEletronico{

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Smartphone ligado!");
    }

    @Override
    public void mensagem() {
        System.out.println("Nome: Smartphone");
    }
    
}
