import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
//        Compra compra1 = new Compra();
//        compra1.adicionarItem("Caneta", 1, 100);
//        compra1.adicionarItem(new Produto("Notebook", 2000), 2);
//
//        Compra compra2 = new Compra();
//        compra2.adicionarItem("Caneta", 9.67, 100);
//        compra2.adicionarItem(new Produto("Notebook", 1897.88), 2);
//
//        Cliente cliente = new Cliente("Célio João");
//
//        cliente.adicionarCompra(compra1);
//        cliente.adicionarCompra(compra2);
//
//        System.out.println(cliente.obterValorTotal());

        System.out.println("Sistema de compras:");
        System.out.println("----------------------------------------------------------");

        while(true) {
            menuOpcoes();
            menuSelecionar();
        }

    }


    private static void menuOpcoes() {
        System.out.println("1 - Incluir cliente");
        System.out.println("2 - Lançar uma compra");
        System.out.println("3 - Consultar uma compra");
        System.out.println("4 - Receber uma compra:");
        System.out.println("0 - Sair do sistema:");
    }


    private static int StringToInteger(Scanner entrada) {
        int result = -1;
        try {
            System.out.print("Digite um valor de 0 a 4: ");
            result = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite um número de 0 a 4");
        }
        return result;
    }


    private static void menuSelecionar() {
        Scanner opcoes = new Scanner(System.in);
        String clienteCompra = "Cliente Consumidor";
        String nomeProduto;
        double precoProduto;
        int qtdProduto;
        Compra compra = new Compra();
        Cliente cliente;



        switch (StringToInteger(opcoes)) {
            case 1:
                System.out.println("Digite o nome do cliente da compra:");
                clienteCompra = opcoes.nextLine();
//              cliente = new Cliente(clienteCompra);

            case 2:
                System.out.println("Vamos iniciar a compra:");

                System.out.println("Digite o nome do produto:");
                nomeProduto = opcoes.nextLine();

                System.out.println("Digite o preço do produto:");
                precoProduto = opcoes.nextDouble();

                System.out.println("Digite a quantidade de produtos:");
                qtdProduto = opcoes.nextInt();

                compra.adicionarItem(nomeProduto, precoProduto, qtdProduto);
                compra.obterValorTotal();

                break;
            case 0:
                sairSistema();
                break;

        }
    }


    private static void sairSistema() {
        System.out.println("Saindo do sistema");
        System.exit(0);
    }
}
