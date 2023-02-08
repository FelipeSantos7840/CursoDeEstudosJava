package estudofelipe.orientacaoobjeto.polimorfismo.teste;

import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Computador;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Produto;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Tomate;
import estudofelipe.orientacaoobjeto.polimorfismo.servico.CalculadoraImposto;

public class TesteProdutos03 {
    public static void main(String[] args) {
        Produto computador = new Computador("NUC1023",7000);
        Tomate tomate = new Tomate("Tomatao DevDojo",10);

        tomate.setDataValidade("17/03/2023");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("____________________");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
