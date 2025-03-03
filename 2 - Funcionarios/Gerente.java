public class Gerente extends Funcionario {

      public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcular_bonus() {
        double salario_bonus = (this.salario * 0.2) + this.salario;
        System.out.print("Meu salário junto com o bonus é de: " + salario_bonus);
    }

    @Override
    public void retorna_mensagem() {
        System.out.println("Eu sou um gerente");
        System.out.println("Meu nome é: " + this.nome);
        System.out.println("Meu salário é: " + this.salario);
        System.out.println("Meu bonus é de: 20%");
        // System.out.println("Meu bonus é: " + calcular_bonus());
    }
    
}
