public class PagamentoDinheiro extends Pagamento {

    private double pagamento;

    public PagamentoDinheiro(double pagamento) {
        this.pagamento = pagamento;
    }


    @Override
    public void incluirPagamento(Vendas venda, double valorPagamento) {
        venda.receberPagamento(valorPagamento);
    }
}


