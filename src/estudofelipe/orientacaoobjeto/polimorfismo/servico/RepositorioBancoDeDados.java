package estudofelipe.orientacaoobjeto.polimorfismo.servico;

import estudofelipe.orientacaoobjeto.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de Dados");
    }
}
