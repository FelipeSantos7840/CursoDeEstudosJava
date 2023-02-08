package estudofelipe.orientacaoobjeto.heranca.teste;

import estudofelipe.orientacaoobjeto.heranca.dominio.Endereco;
import estudofelipe.orientacaoobjeto.heranca.dominio.Funcionario;
import estudofelipe.orientacaoobjeto.heranca.dominio.Pessoa;

public class TesteHeranca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        System.out.println("-----------");
        endereco.setRua("Rua Aristides Bonifacio");
        endereco.setCep("99540000");
        Pessoa pessoa = new Pessoa("Felipe","08095179990",endereco);//CTRL + B Para ir direto para classe

        pessoa.imprimir();
        System.out.println("-----------");

        Funcionario func = new Funcionario("Josefino","11111111111",2504.2,endereco);//PARAMETROS PARA O CONSTRUTOR

        func.imprimir();
    }
}
