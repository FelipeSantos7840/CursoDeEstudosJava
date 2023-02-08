package estudofelipe.orientacaoobjeto.exercicioassociacao.dominio;

public class Seminario {
    private String titulo;
    private Estudantes[] estudantes;
    private Local localSeminario;

    //CONSTRUTOR
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Estudantes[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminario(String titulo, Estudantes[] estudantes, Local localSeminario) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.localSeminario = localSeminario;
    }

    //GETTER E SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocalSeminario() {
        return localSeminario;
    }

    public void setLocalSeminario(Local localSeminario) {
        this.localSeminario = localSeminario;
    }
}
