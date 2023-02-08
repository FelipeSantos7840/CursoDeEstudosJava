package estudofelipe.excecoes.excecoessobreescritas.teste;

import estudofelipe.excecoes.excecoessobreescritas.dominio.Funcionario;
import estudofelipe.excecoes.excecoessobreescritas.dominio.Pessoa;

import java.io.FileNotFoundException;

public class TesteExcecaoSobrescrita {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //QUANDO ESTÁ SOBREESCREVENDO UM METODO NÃO É OBIRGATORIO REESCREVER
        //AS EXCEÇÕES LANÇADAS, MAS ISSO PODE ENFLUENCIAR A NECESSIDADE DE UM TRY

        funcionario.salvar();
        try{
            pessoa.salvar();
        } catch(FileNotFoundException e){
            System.out.println("oi");
        }

    }
}
