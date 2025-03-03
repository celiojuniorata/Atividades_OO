public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void abastecer() {
        System.out.println("Abastecendo com gasolina");
    }
    
    public void apresentarMensagem() {
        System.out.println("Carro da marca " + marca + " e modelo " + modelo);
    }
}
