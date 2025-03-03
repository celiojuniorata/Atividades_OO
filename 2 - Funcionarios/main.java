public class main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {new Gerente("player um", 18000), new Desenvolvedor("player dois", 12000)};

        for (Funcionario funcionario : funcionarios) {
            funcionario.retorna_mensagem();
            funcionario.calcular_bonus();
            System.out.println("\n -------------------------------- \n");
        } 
    }
}