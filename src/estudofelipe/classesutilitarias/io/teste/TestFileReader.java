package estudofelipe.classesutilitarias.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        File file = new File("arquivo/escritaArquivo.txt");
        try (FileReader fr = new FileReader(file)){

            //System.out.println(fr.read()); //RETORNA O VALOR ASCII DO PRIMEIRO CARACTER



            //char[] chars = new char[40];
            //fr.read(chars); //DESSA MANEIRA ESTAMOS PASSANDO O VETOR DE 30 CARACTERES COMO PARAMETRO PARA SER ARMAZENADO
                            //O QUE FOR LIDO
            //for (char letra : chars){
            //    System.out.print(letra);//PRINTANDO O QUE FOI LIDO ANTERIORMENTE
            //}
            //System.out.println("\n");



            //int i;
            //while((i=fr.read()) != -1){ //AO FINALIZAR O ARQUIVO É ENVIADO UM -1
            //    System.out.print((char) i);
            //}

            int i;
            while ((i=fr.read()) != 10){
                System.out.print((char) i);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
