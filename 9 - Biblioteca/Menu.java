public class Menu {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        biblioteca.removerLivro(livro1);
    }
}