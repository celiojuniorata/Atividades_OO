public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }

    public void abastecer() {
        System.out.println("Abastecendo com diesel");
    }

    public void apresentarMensagem() {
        System.out.println("Caminhão da marca " + marca + " e modelo " + modelo);
    }   
    
}
