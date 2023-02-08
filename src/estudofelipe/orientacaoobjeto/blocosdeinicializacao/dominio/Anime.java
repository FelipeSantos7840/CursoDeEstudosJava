package estudofelipe.orientacaoobjeto.blocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    { //BLOCOS ANTES DO CONTRUTOR QUE EXUCATAM CODIGOS NA CRIAÇÃO DE UM OBJETO
        System.out.println("INICIALIZADOR");
        episodios = new int [100]; //INCIALIZAR A QUANTIDADE DE EPS =D
        for (int x=0; x < episodios.length;x++){
            episodios[x] = x+1;
        }
    }
    //CONSTRUTOR
    public Anime(String nome){
        this.nome = nome;
    }

    public void impressora(){
        System.out.println(this.nome);
        for (int x=0; x< episodios.length;x++) {
            System.out.print(episodios[x] + " ");
        }
    }
}
