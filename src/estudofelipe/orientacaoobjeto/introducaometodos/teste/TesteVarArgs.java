package estudofelipe.orientacaoobjeto.introducaometodos.teste;

import estudofelipe.orientacaoobjeto.introducaometodos.dominio.Calculadora;

public class TesteVarArgs {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somarVarArgs("CARALHO:",2,3,4,5,3,1);

        int[] val = {2,3,4,5,3,1};

        calc.somarVarArgs("Soma: ",val);
    }
}
