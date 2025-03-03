public class Notebook extends ProdutoEletronico{

    public Notebook(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Notebook iniciado!");
    }

    @Override
    public void mensagem() {
        System.out.println("Nome: Notebook");
    }
    
}
