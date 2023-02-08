package estudofelipe.orientacaoobjeto.polimorfismo.servico;

import estudofelipe.orientacaoobjeto.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
