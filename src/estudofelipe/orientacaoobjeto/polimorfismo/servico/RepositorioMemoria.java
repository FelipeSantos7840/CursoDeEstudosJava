package estudofelipe.orientacaoobjeto.polimorfismo.servico;

import estudofelipe.orientacaoobjeto.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na Memoria");
    }
}
