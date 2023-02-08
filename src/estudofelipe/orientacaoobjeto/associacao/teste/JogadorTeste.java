package estudofelipe.orientacaoobjeto.associacao.teste;

import estudofelipe.orientacaoobjeto.associacao.dominio.Jogador;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador("Pelé");
        Jogador jog2 = new Jogador("Romário");
        Jogador jog3 = new Jogador("Neymar");

        //INCIALIZAÇÃO DE ARRAYS DE OBJETOS, PODE SER FEITO A ATRIBUIÇÃO
        //DOS OBJETOS AOS INDICES DOS ARRYS
        Jogador[] jogadores = new Jogador[]{jog1,jog2,jog3};

        //PODE SER FEITO TAMBEM DESSA MANEIRA:
        Jogador[] jogadores2 = new Jogador[3];
        jogadores2[0] = jog1;

        //A IMPRESSÃO SAÍRA A REFERENCIA DA INSTANCIA DO OBJETO:
        System.out.println(jogadores);
        System.out.println(jog1);
        System.out.println(jogadores[0]); //AMBOS jog1 e jogadores[0]
                                          //POSSUEM MESMA REFERENCIA
        System.out.println("----------------");
        //IMPRESSÃO DE NOMES:
        for(Jogador jogador: jogadores){
            jogador.imprimir();
        }
    }
}
