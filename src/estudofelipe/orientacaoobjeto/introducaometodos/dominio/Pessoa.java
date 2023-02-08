package estudofelipe.orientacaoobjeto.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setIdade(int idade) { //SETTERS VOID E UTILIZA PARAMETROS
        if(idade < 0){
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() { //GETTER UTILIZA RETORNO DO TIPO DO ATRIBUTO
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
