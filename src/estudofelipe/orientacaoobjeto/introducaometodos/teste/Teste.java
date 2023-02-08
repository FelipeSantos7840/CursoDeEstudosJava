package estudofelipe.orientacaoobjeto.introducaometodos.teste;

import estudofelipe.orientacaoobjeto.introducaometodos.dominio.Calculadora;

public class Teste {
    public static void main(String[] args) {
        Calculadora soma = new Calculadora();

        soma.somaDoisNumeros();
        System.out.println("VOLTEI");
        soma.subtrairDoisNumeros();
        System.out.println("ACABEI!");
    }
}
