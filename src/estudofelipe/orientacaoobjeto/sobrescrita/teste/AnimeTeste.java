package estudofelipe.orientacaoobjeto.sobrescrita.teste;

import estudofelipe.orientacaoobjeto.sobrescrita.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr Stone");
        System.out.println(anime); //A INFORMAÇÃO IMPRESSA DE UMA VARIAVEL DE REFERENCIA
                                   //SE BASEIA NO METODO TOSTRING, SENDO ASSIM
                                   //QUANDO O MESMO É ALTERADO, O RESULTADO ALTERA AO IMPRIMIR

        System.out.println(anime.toString());//TAMBEM PODE SER IMPRESSO DESSA MANEIRA
    }
}
