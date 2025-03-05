// import Vendas; // replace with the actual package name

public class PagamentoPix extends Pagamento {
    private double pagamento;

    public PagamentoPix(double pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public void incluirPagamento(Vendas venda, double pagamento) {
        venda.receberPagamento(pagamento);
    }
}
