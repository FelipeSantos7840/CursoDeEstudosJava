package estudofelipe.orientacaoobjeto.polimorfismo.teste;

import estudofelipe.orientacaoobjeto.polimorfismo.repositorio.Repositorio;
import estudofelipe.orientacaoobjeto.polimorfismo.servico.RepositorioBancoDeDados;

public class TesteRepositorio {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        //UTILIZANDO A INTERFACE GENERICA PARA FAZER A REFERENCIA, PODEMOS UTILIZAR DE SEUS METODOS QUE FORAM
        //SOBREESCRITOS NOS OBJETOS PARA ECONOMIZAR LINHAS DE CÓDIGOS E FACILITAR A MANUTENÇÃO
    }
}
