public class VendaDefault extends Vendas {
    public double totalVenda = 0;

    @Override
    public void incluirValorVenda(double valor) {
        totalVenda += valor;
    }

    @Override
    public void receberPagamento(double valor) {
        totalVenda -= valor;
        System.out.println("Pagamento de " + valor + " recebido.");
    }

    @Override
    public void extratoVenda() {
        System.out.println("Total da venda: " + totalVenda);
    }

    private static void teste(){
        Menu.menuSelecionar();
    };
}
