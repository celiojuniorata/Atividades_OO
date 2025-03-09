public class PagamentoDinheiro extends Pagamento {

    // private double pagamento;
    @Override
    public void incluirPagamento(Vendas venda, double valorPagamento) {
        venda.receberPagamento(valorPagamento);
    }
}


