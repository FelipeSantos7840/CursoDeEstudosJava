package estudofelipe.orientacaoobjeto.primeiroexercicioclasses.teste;

import estudofelipe.orientacaoobjeto.primeiroexercicioclasses.dominio.Carro;

public class TesteCarro {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "147";
        car1.modelo = "Carro Popular";
        car1.ano = 1964;

        car2.nome = "Ranger";
        car2.modelo = "Caminhonte";
        car2.ano = 2002;

        car1 = car2; // AO REALIZAR ISSO INDICA QUE AMBAS VARIAVEIS DE REFERENCIA ESTÃO NO MESMO OBJETO

        car1.nome = "FordKA"; //ATRIBUINDO UM VALOR AO CAR1 TAMBEM IRA ALTERAR O CAR2, POIS AMBOS
                             // ESTÃO NO MESMO OBJETO

        //TESTE
        System.out.println(car1.nome);
        System.out.println(car1.modelo);
        System.out.println(car1.ano);
        System.out.println("------------------");
        System.out.println(car2.nome);
        System.out.println(car2.modelo);
        System.out.println(car2.ano);
    }


}
