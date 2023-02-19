package estudofelipe.classesutilitarias.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
    public static void main(String[] args) {
        File file = new File("arquivo/escritaArquivo.txt");

        try (FileWriter fw = new FileWriter(file,true);BufferedWriter bfw = new  BufferedWriter(fw);){ //UTILIZADO TRY WITH RECOURSES PARA FECHAR O FILEWRITER AUTOMATICAMENTE
            bfw.write("Hello World in file!"); //ESCREVE NO ARQUIVO
            bfw.newLine(); //PULA UMA LINHA (MELHOR QUE \N)
            bfw.flush(); //LIMPA O BUFFER PARA GARANTIR QUE TUDO FOI ESCRITO
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
