package estudofelipe.orientacaoobjeto.modificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //FAZ COM QUE O INICIALIZADOR SEJA INICIALIZADO APENAS 1 VEZ
    static { //BLOCOS ANTES DO CONTRUTOR QUE EXUCATAM CODIGOS NA CRIAÇÃO DE UM OBJETO
        System.out.println("INICIALIZADOR");
        episodios = new int [100]; //INCIALIZAR A QUANTIDADE DE EPS =D
        for (int x=0; x < episodios.length;x++){
            episodios[x] = x+1;
            System.out.print(x+1 + " ");
        }
        System.out.println("");
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
