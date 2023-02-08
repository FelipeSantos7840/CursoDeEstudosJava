package estudofelipe.orientacaoobjeto.introducaometodos.teste;

import estudofelipe.orientacaoobjeto.introducaometodos.dominio.Calculadora;

public class TesteParametro {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.multiplicaDoisNumeros(1457,343);

        System.out.println("-------");

        double result = calc.divideDoisNumeros(5,0);
        System.out.println("PRINTEI: " + result);
    }
}
