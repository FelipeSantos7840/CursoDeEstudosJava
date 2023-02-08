package estudofelipe.orientacaoobjeto.sobrecargademetodos.teste;

import estudofelipe.orientacaoobjeto.sobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime ani1 = new Anime();
        ani1.init("Anime",1048,"One Piece","Ação");
        ani1.imprimir();
    }
}
