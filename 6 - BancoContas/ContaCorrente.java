public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else System.out.println("Saldo insuficiente");
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else System.out.println("Saldo insuficiente");
    }

    @Override
    public void extrato() {
        System.out.println("Titular: " + this.titular + 
                           "\nSaldo: " + this.saldo);
    }
}
