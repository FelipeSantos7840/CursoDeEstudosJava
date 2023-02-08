package estudofelipe.orientacaoobjeto.associacao.teste;

import estudofelipe.orientacaoobjeto.associacao.dominio.Jogador;
import estudofelipe.orientacaoobjeto.associacao.dominio.Time;

public class JogadorTesteBidirecional {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2}; //ARRAY DE JOGADORES

        jogador.setTime(time); //JOGADOR ESTÁ LIGADO AO TIME
        jogador2.setTime(time); //JOGADOR2 ESTÁ LIGADO AO TIME
        time.setJogadores(jogadores); //O TIME ESTÁ LIGADO AOS DOIS
                                      //JOGADORES

        System.out.println("-----Jogador-----");
        jogador.imprimir();
        jogador2.imprimir();
        System.out.println("-----Time-----");
        time.imprimir();
    }
}
