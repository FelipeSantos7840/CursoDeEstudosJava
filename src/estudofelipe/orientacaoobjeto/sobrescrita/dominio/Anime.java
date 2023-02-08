package estudofelipe.orientacaoobjeto.sobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome){
        this.nome = nome;
    }

    @Override//ANOTAÇÃO QUE FORÇA QUE O METODO ABAIXO SEJA SOBRESCRITO
    public String toString(){ //SOBRESCRITA SOBRE O METODO ORIGINADO DA CLASSE OBJETCT
        return "Nome: " + nome;//SERA RETORNADO ESSE VALOR AGORA AO IMPRIMIR A VAR. REFERENCIA
    }
    //1- PARA SOBRESCREVER O NOME DEVE SER O MESMO!
    //2- A ASSINATURA E RETORNO DEVEM SER AS MESMAS!
    //3- NÃO PODE DEIXAR O ACESSO MAIS RESTRITIVO QUE O ORIGINAL!


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
