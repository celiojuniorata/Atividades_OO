public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 100 && valor <= this.saldo) {
            this.saldo -= valor;
        } else System.out.println("Valor inválido");
    }

    @Override
    public void depositar(double valor)  {
        if(valor > 0) {
            this.saldo += valor;
        } else System.out.println("Valor inválido");
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + this.titular + 
                           "\nSaldo: " + this.saldo);
    }


    
}
