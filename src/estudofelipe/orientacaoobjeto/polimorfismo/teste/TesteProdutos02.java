package estudofelipe.orientacaoobjeto.polimorfismo.teste;

import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Computador;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Produto;
import estudofelipe.orientacaoobjeto.polimorfismo.servico.CalculadoraImposto;

public class TesteProdutos02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("i7 4440k gtx 2080",6500);
        //Dessa maneira é acessivel apenas os atributos que estiverem na origem da variavel de referencia, NÃO sendo possivel
        //acessar caso houvesse um novo atributo apenas para computador

        //Tambem não é possivel utilizar a calculadora de imposto, pois ela aguarda o parametro de alguma das subclasses
    }
}
