public class main{
    public static void main(String[] args) {
        System.out.println("Hello World");


        Veiculo[] veiculos = {new Carro("Fiat", "Uno"), new Moto("Honda", "CG"), new Caminhao("Volvo", "FH")};

        for (Veiculo veiculo : veiculos) {
            veiculo.apresentarMensagem();
            veiculo.abastecer();
        }
    }
}