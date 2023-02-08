package estudofelipe.orientacaoobjeto.associacao.dominio;

public class Professor {
    private String nome;

    //CONSTRUTOR
    public Professor(String nome) {
        this.nome = nome;
    }

    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
