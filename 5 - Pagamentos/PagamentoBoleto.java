public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    public void realizar_pagamento() {
        System.out.println("Pagamento realizado com boleto no valor de R$" + this.valor);
    }
    
}
