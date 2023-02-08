package estudofelipe.excecoes.excecoessobreescritas.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws ExcecaoCustomException, FileNotFoundException{
        System.out.println("Salvando Pessoa");
    }
}
