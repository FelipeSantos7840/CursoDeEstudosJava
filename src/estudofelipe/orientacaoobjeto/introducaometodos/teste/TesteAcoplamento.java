package estudofelipe.orientacaoobjeto.introducaometodos.teste;

import estudofelipe.orientacaoobjeto.introducaometodos.dominio.Pessoa;

public class TesteAcoplamento {
    public static void main(String[] args) {
        Pessoa pess = new Pessoa();
        pess.setIdade(10);
        pess.setNome("Carlito");
        System.out.println("-----------");
        pess.imprimir();
    }
}
