package estudofelipe.classesutilitarias.io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        File file = new File("arquivo/escritaArquivo.txt");

        try ( FileWriter fw = new FileWriter(file,true) ){ //UTILIZADO TRY WITH RECOURSES PARA FECHAR O FILEWRITER AUTOMATICAMENTE
            fw.write("Olá Brasil no arquivo!\n"); //ESCREVE NO ARQUIVO
            fw.flush(); //LIMPA O BUFFER PARA GARANTIR QUE TUDO FOI ESCRITO
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
