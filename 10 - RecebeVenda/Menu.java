import java.util.Scanner;

public class Menu {
    private static VendaDefault venda = new VendaDefault();

    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao sistema de vendas do seu zé!");
        System.out.println("-------------------------------------------------------");

        while (true) {
            menuOpcoes();
            menuSelecionar();
        }
    }

    static private void menuOpcoes() {
        System.out.println("1 - Incluir valor na venda.");
        System.out.println("2 - Incluir pagamento para a venda.");
        System.out.println("3 - Consultar o valor da venda.");
        System.out.println("0 - Sair do sistema");
    }

    static private int StringToInteger(Scanner entrada) { //Tratando a entrada do valor
        int result = -1;
        try {
            result = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número entre 0 e 3");
        }
        return result;
    }

    static private void menuSelecionar() {
        Scanner entrada = new Scanner(System.in);
        double valor = 0;

        switch (StringToInteger(entrada)) {
            case 1:
                System.out.println("Digite o valor ou digite 0 para sair.");
                valor = entrada.nextDouble();

                if (valor != 0) {
                    venda.incluirValorVenda(valor);
                } else sairSistema();
                break;

            case 2:
                System.out.println("Digite o valor do pagamento.");
                valor = entrada.nextDouble();
                Pagamento pagamento = new PagamentoPix(valor);
                pagamento.incluirPagamento(venda, valor);
                break;

            case 3:
                venda.extratoVenda();
                break;

            case 0:
                sairSistema();
                break;

            default:
                break;
        }
    }

    
    static private void sairSistema() {
        System.out.println("Saindo do sistema.");
        System.exit(0);
    }
}