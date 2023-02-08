package estudofelipe.orientacaoobjeto.modificadorfinal.teste;

import estudofelipe.orientacaoobjeto.modificadorfinal.dominio.Carro;
import estudofelipe.orientacaoobjeto.modificadorfinal.dominio.Comprador;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador compr = new Comprador();
        carro.COMPRADOR.setNome("Felipe");

        System.out.println(carro.toString());
    }
}
