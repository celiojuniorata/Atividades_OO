public class main {
    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente("Célio", 10);
        ContaPoupanca poupanca = new ContaPoupanca("Célio", 10000);

        corrente.depositar(10);
        corrente.sacar(100);
        corrente.extrato();


        poupanca.depositar(10);
        poupanca.sacar(1001);
        poupanca.extrato();
    }
}