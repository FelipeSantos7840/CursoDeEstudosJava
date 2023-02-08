package estudofelipe.excecoes.excecoessobreescritas.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    //1- Na sobrescrita pode ou não ter as Exceções da super
    //2- As exceções podem ser iguais ou especializações das comparadas com a
    //super
    //3- Não pode ser colocado nenhuma do tipo CHECKED que foi declarada
    //no metodo original
    @Override
    public void salvar(){
        System.out.println("Salvando Funcionario");
    }
}
