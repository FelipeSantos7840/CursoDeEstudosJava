package estudofelipe.orientacaoobjeto.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    //IMPRESSORA
    public void imprimir(){
        System.out.println(nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }

    //CONTRUTORES
    public Jogador(String nome) {
        this.nome = nome;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
