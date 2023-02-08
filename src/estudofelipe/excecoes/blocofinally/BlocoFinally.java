package estudofelipe.excecoes.blocofinally;

public class BlocoFinally {

    //BLOCO FINALLY PERMITE QUE UM COMANDO SEJA OBRIGATORIAMENTE EXECUTADO
    //INDEPENDENTE SE OCORREU OU NÃO UMA EXCEÇÃO, EXTRETAMENTE IMPORTANTE PARA
    //TRATAMENTO DE RECURSOS (Aula 100)

    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo");
            //DESSA MANEIRA INDEPENDENTE DE OCORRER OU NÃO UMA EXCEÇÃO DURANTE A LEITURA
            //DO ARQUVIO ELE SERÁ FECHADO NO FINAL

            //EM CASO DE ALGUM METODO ELE IRA EXECUTAR PRIMEIRO QUE UM RETURN
        }
    }
}
