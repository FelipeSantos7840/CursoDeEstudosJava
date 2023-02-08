package estudofelipe.orientacaoobjeto.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    //IMPRESSORA
    public void imprimir(){
        System.out.println(this.nome);
        if(jogadores != null){
            for(Jogador jog : jogadores){
                System.out.println(jog.getNome());
            }
        }
    }

    //CONSTRUTOR
    public Time(String nome) {
        this.nome = nome;
    }

    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
