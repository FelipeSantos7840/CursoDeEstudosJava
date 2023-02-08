package estudofelipe.orientacaoobjeto.polimorfismo.teste;

import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Computador;
import estudofelipe.orientacaoobjeto.polimorfismo.dominio.Tomate;
import estudofelipe.orientacaoobjeto.polimorfismo.servico.CalculadoraImposto;

public class TesteProdutos {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC1023",7000);
        Tomate tomate = new Tomate("Tomatao DevDojo",10);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(tomate);
        //PELOS METODOS ESTAREM ESTATICOS É POSSIVEL UTILIZAR A CLASSE IMPORTADA
        //PARA EXECUTA-LOS SEM UTILIZAR UM NOVO OBJETO
    }
}
