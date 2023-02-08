package estudofelipe.orientacaoobjeto.polimorfismo.servico;

import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Computador;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Produto;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Calcula de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome Produto: " + produto.getNome());
        System.out.println("Valor Produto: " + produto.getValor());
        System.out.println("Imposto calculado: " + produto.calcularImposto());
        if(produto instanceof Tomate){ //VALIDA SE A VAR. REFERENCIA produto É INSTACIADA DO TOMATE QUE POSSUI dataValidade
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }
}
