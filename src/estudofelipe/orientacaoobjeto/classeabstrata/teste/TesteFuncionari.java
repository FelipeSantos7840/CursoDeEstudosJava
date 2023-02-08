package estudofelipe.orientacaoobjeto.classeabstrata.teste;

import estudofelipe.orientacaoobjeto.classeabstrata.dominio.Desenvolvedor;
import estudofelipe.orientacaoobjeto.classeabstrata.dominio.Funcionario;
import estudofelipe.orientacaoobjeto.classeabstrata.dominio.Gerente;

public class TesteFuncionari {
    public static void main(String[] args) {
        Gerente gere = new Gerente("Nami",4000);
        Desenvolvedor des = new Desenvolvedor("Touya", 12000);
        System.out.println(gere);
        System.out.println(des);
    }
}
