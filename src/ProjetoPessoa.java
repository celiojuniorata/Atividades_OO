public class ProjetoPessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String idioma;

    public ProjetoPessoa(String nome, String sobrenome, int idade, String idioma) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.idioma = idioma;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getIdioma() {
        return idioma;
    }
}
