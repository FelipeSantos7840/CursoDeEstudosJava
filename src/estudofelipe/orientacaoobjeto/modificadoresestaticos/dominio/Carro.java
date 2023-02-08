package estudofelipe.orientacaoobjeto.modificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
            //ESTÁ INDICANDO QUE A VELOCIDADE ESTÁ RELACIONADA COM A CLASSE
            //E NÃO MAIS COM SEUS OBJETOS, CASO SEJA ALTERADO O SEU VALOR EM
            //UM OBJETO, TODOS OS OBJETOS DE CARRO TAMBEM SERÃO ALTERADOS!

    //CRIAÇÃO DE UM METODO ESTATICO
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
        //É NECESSARIO INFORMAR A CLASSE EM METODOS ESTATICOS NO LUGAR DE THIS
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    //IMPRESSORA
    public void imprime(){
        System.out.println("------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Vel. Max: "+this.velocidadeMaxima);
        System.out.println("Vel. Limite: "+ Carro.velocidadeLimite);
    }                                       //PELO ATRIBUTO SER STATIC, O CORRETO
                                            //SERÁ A UTILIZAÇÃO DO NOME DA CLASSE
                                            //E NÃO DO THIS!

    //CONTRUTOR
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    //GETTER E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
