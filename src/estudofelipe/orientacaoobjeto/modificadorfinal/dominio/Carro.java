package estudofelipe.orientacaoobjeto.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();//INDICA QUE A REFERENCIA
                                                        //NUNCA PODERA SER ALTERADA

    private static double velocidadeLimite = 250; //DECLARAÇÃO DO ATRIBUTO ESTATICO
                                            //SENDO REFERENTE A CLASSE E NÃO A SEUS OBJETOS
    public final double VELOCIDADE_LIMITE = 250; //VARIAVEL CONSTANTE, NA QUAL MESMO PUBLICA NÃO PODERA TER SEU VALOR
                                                 //ALTERADO

    public final String toString(){//AO INDICAR QUE UM METODO É FINAL, ELE NÃO PODERA SER SOBESCRITO POR SUAS FUTRAS SUBCLASSES
        return nome + "\n"+ VELOCIDADE_LIMITE + "\n" + COMPRADOR.toString();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
