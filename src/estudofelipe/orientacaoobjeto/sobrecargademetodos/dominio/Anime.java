package estudofelipe.orientacaoobjeto.sobrecargademetodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void init(String tipo, int episodios, String nome){ //SOBRECARGA
        this.tipo = tipo;                                      //DIFERENTES ASSINATURAS MAS MESMO NOME
        this.episodios = episodios;
        this.nome = nome;
    }

    public void init(String tipo, int episodios, String nome, String genero){
        this.init(tipo,episodios,nome); //É POSSIVEL CHAMAR O DE CIMA PARA EVITAR REPETIÇÃO DE CODIGO
        this.genero = genero;
    }

    public void imprimir(){
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
}
