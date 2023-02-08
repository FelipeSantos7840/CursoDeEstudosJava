package estudofelipe.orientacaoobjeto.heranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    //CONSTRUTOR
    public Pessoa(String nome, String cpf){ //CRIAÇÃO DE METODO CONSTRUTOR DE UMA CLASSE PAI
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco){
        this(nome,cpf);
        this.endereco = endereco;
    }

    //IMPRESSORA
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getCep());
        System.out.println(this.endereco.getRua());
    }

    //GETTER E SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
