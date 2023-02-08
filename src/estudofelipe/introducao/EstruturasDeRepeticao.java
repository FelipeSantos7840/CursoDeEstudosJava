package estudofelipe.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while do-while for

        System.out.println("WHILE");//CONDIÇÃO ANTES PODE FAZER COM QUE NÃO EXECUTE UMA VEZ
        int cont = 0;
        while (cont < 10){
            System.out.println(++cont);
        }

        System.out.println("DO WHILE");//EXECUTA PELO MENOS UMA VEZ
        cont=0;
        do{
            System.out.println(++cont);
        } while (cont <10);

        System.out.println("FOR");//REPETIÇÃO PRÉ-DETERMINADA
        cont=0;
        for(cont=0;cont<10;++cont){
            System.out.println(cont);
        }
    }
}
