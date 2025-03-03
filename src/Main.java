public class Main {
    public static void main(String[] args) {
        
        RecebimentoDinheiro dinheiro = new RecebimentoDinheiro("Dinheiro", 300.00);
        System.out.println(dinheiro.getFormaRecebimento() + dinheiro.getValor() + dinheiro.getParcelas());

        }
}
