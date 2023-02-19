package estudofelipe.classesutilitarias.io.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
    public static void main(String[] args) {
        File file = new File("arquivo/escritaArquivo.txt");
        try (FileReader fr = new FileReader(file);
             //Buffered, primeiramente armazena os dados na memoria depois realizar a impressão agilizando o processo

             BufferedReader bfr = new BufferedReader(fr)){

            //Primeiro Metodo de Leitura
            String line = bfr.readLine();//LÊ A PRIMEIRA LINHA DO ARQUVIO
            String line2 = bfr.readLine();//LÊ A SEGUNDA LINHA DO ARQUVIO

            System.out.println(line);
            System.out.println(line2);

            //Segundo Metodo de Leitura
            String linha;

            while((linha=bfr.readLine()) != null){
                System.out.println(linha);
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
