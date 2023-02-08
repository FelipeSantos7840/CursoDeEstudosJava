package estudofelipe.orientacaoobjeto.contrutor.dominio;

public class Anime {
        private String tipo;
        private int episodios;
        private String nome;
        private String genero;
        private String estudio;

        public Anime(String tipo, int episodios, String nome, String genero){ //CONSTRUTOR
            this.tipo = tipo;                                                 //NÃO POSSUI TIPO NEM SEQUER VOID
            this.episodios = episodios;
            this.nome = nome;
            this.genero = genero;
        }

        public Anime(String tipo, int episodios, String nome, String genero,String estudio){ //SOBRECARGA DE CONSTRUTOR
            this(tipo,episodios,nome,genero); //CHAMADA DE CONSTRUTOR NA CLASSE
            //A CHAMADA DE SOBRECARGA DE UM CONSTRUTOR DEVE SER SEMPRE! SEMPRE! A PRIMEIRA LINHA
            this.estudio = estudio;
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

        public void setEpisodios(int episodios){this.episodios = episodios;}
}
