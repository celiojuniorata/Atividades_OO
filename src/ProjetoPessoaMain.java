import java.util.Scanner;

public class ProjetoPessoaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                break;
            }

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite seu idioma:");
            String idioma = scanner.nextLine();

            ProjetoPessoa pessoa = new ProjetoPessoa(nome, sobrenome, idade, idioma);

            System.out.println("Com base na sua análise: \n" +
                "Seu nome é: " + pessoa.getNome() + "\n" +
                "Seu sobrenome é: " + pessoa.getSobrenome() + "\n" +
                "Sua idade é: " + pessoa.getIdade() + "\n" +
                "Seu idioma é: " + pessoa.getIdioma());
        }
        
        scanner.close();
    }
}
