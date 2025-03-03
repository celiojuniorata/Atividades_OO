public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Pagamento[] pagamentos = {new PagamentoCartao(100),
                                  new PagamentoBoleto(200),
                                  new PagamentoPix(300)};

        for (Pagamento pagamento: pagamentos) {
            pagamento.realizar_pagamento();
        }
    }
}