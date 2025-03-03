public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    public void realizar_pagamento() {
        System.out.println("Pagamento realizado com cartão no valor de R$" + this.valor);
    }
    
}
