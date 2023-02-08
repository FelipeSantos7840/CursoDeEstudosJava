package estudofelipe.orientacaoobjeto.introducaometodos.teste;

import estudofelipe.orientacaoobjeto.introducaometodos.dominio.Estudante;
import estudofelipe.orientacaoobjeto.introducaometodos.dominio.ImpressoraEstudante;
//SE ATENTAR COM O ENDEREÇO PARA A IMPORTAÇÃO EM CASO DE CLASSES COM O MESMO NOME

public class TesteParametrosReferencia {
    public static void main(String[] args) {
        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();
        ImpressoraEstudante printer = new ImpressoraEstudante();

        //INICIALIZAÇÃO
        est1.nome = "Aoi";
        est2.nome = "Yui";

        est1.idade = 14;
        est2.idade = 23;

        est1.sexo = 'F';
        est2.sexo = 'M';

        //UTILIZAÇÃO
        printer.impressora(est1);
        printer.impressora(est2);

    }
}
