package estudofelipe.orientacaoobjeto.modificadoresestaticos.teste;

import estudofelipe.orientacaoobjeto.modificadoresestaticos.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi",290);

        //METODO ESTATICO ENTÃO É UTILIZADO PELA CLASSE NO LUGAR DO OBJETO
        Carro.setVelocidadeLimite(230);
        //PELA VELOCIDADE LIMITE SER STATIC, TODOS OBJETOS SERÃO ALTERADOS

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }




}
