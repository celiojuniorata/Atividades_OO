public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    public void realizar_pagamento() {
        System.out.println("Pagamento realizado com Pix no valor de R$" + this.valor);
    }
}
