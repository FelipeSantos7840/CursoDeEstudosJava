package estudofelipe.orientacaoobjeto.modificadorfinal.dominio;

public class Comprador {
    private String nome;

    public String toString(){
        return "Nome: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
