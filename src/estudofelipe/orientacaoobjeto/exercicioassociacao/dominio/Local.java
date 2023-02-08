package estudofelipe.orientacaoobjeto.exercicioassociacao.dominio;

public class Local {
    private String endereco;

    //CONSTRUTOR


    public Local(String endereco) {
        this.endereco = endereco;
    }

    //GETTER E SETTER
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
