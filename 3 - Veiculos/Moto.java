public class Moto extends Veiculo {

    public Moto(String marca, String modelo) {
        super(modelo, marca);
    }

    public void abastecer() {
        System.out.println("Abastecendo com gasolina");
    }

    public void apresentarMensagem() {
        System.out.println("Moto da marca " + marca + " e modelo " + modelo);
    }   
    
}
