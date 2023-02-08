package estudofelipe.excecoes.erros.test;

public class Erros {
    //Erros em sua grande maioria não podem ser reversiveis em tempo de execução, precisando fechar o sistema
    //e analisar o que pode ter ocorrido

    //Exemplos são: OutOfMemory e StackOverflow

    public static void main(String[] args) {
        //Exemplo StackOverFlow
        recursivo();

        //Pelo procedimento ficar se chamando infinitamente ocorre o StackOverflow, estourando o limite da memoria
        //do Stack
    }

    public static void recursivo(){
        recursivo();
    }
}
