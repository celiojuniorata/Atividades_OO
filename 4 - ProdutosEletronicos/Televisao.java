public class Televisao extends ProdutoEletronico{

    public Televisao(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void ligar() {
        System.out.println("TV ligada no canal padrão!");
    }

    @Override
    public void mensagem() {
        System.out.println("Nome: Televisao");
    }
    
}