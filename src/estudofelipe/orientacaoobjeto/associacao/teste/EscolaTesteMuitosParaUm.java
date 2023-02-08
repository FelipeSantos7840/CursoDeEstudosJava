package estudofelipe.orientacaoobjeto.associacao.teste;

import estudofelipe.orientacaoobjeto.associacao.dominio.Escola;
import estudofelipe.orientacaoobjeto.associacao.dominio.Professor;

public class EscolaTesteMuitosParaUm {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Diguinho");
        Professor[] professores = {professor,professor2};

        Escola escola = new Escola("Konoha");
        escola.setProfessores(professores);
        escola.imprimir();
    }
}
