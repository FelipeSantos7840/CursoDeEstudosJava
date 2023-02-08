package estudofelipe.orientacaoobjeto.associacao.teste;

import estudofelipe.orientacaoobjeto.associacao.dominio.Jogador;
import estudofelipe.orientacaoobjeto.associacao.dominio.Time;

public class JogadorTesteUmParaMuitos {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");


        jogador1.setTime(time1);
        jogador1.imprimir();
    }
}
