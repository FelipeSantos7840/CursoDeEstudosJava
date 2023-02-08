package estudofelipe.orientacaoobjeto.primeiroexericiciometodos.teste;

import estudofelipe.orientacaoobjeto.primeiroexericiciometodos.dominio.Funcionario;

public class ExecucaoFunc {
    public static void main(String args[]){
        Funcionario fun1 = new Funcionario();
        fun1.nome = "Aoi";
        fun1.idade = 19;
        fun1.salario = new float[]{2000,3000,7000};

        fun1.imprimir();
        System.out.println("--------------");
        fun1.mediaSalario();
    }


}
