package estudofelipe.orientacaoobjeto.introducaoclasse.teste;

import estudofelipe.orientacaoobjeto.introducaoclasse.dominio.Estudante; //CLASSES QUE ESTÃO EM PACOTES DISTINTOS
import estudofelipe.orientacaoobjeto.introducaoclasse.dominio.Professor; //CLASSES QUE ESTÃO EM PACOTES DISTINTOS

public class TestePessoa {
    public static void main(String[] args) {
        String flw = new String();
        Estudante pess = new Estudante(); // CHAMADA DE OBJETO
        Professor prof = new Professor();

        pess.nome = "Felipe dos Santos"; // ATRIBUIÇÃO DE ATRIBUTO BASICO
        prof.idade = 32;
    }
}
