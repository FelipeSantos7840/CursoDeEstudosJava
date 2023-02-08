package estudofelipe.orientacaoobjeto.introducaometodos.dominio;

public class ImpressoraEstudante {
    public void impressora (Estudante est){//UTILIZANDO UM OBJETO(REFERENCIA) COMO PARAMETRO
        System.out.println("---------------");
        System.out.println(est.nome + " " + est.idade + " " + est.sexo);

        est.nome = "TROQUEI"; //ALTERAÇÕES AFETAM OS VALORES ATÉ NO MAIN
    }
}
