package estudofelipe.classesutilitarias.io.teste;

import java.io.File;
import java.io.IOException;

public class TestFilePath {
    public static void main(String[] args) {
        File fileDiretorio = new File("arquivo");
        boolean isCreated = fileDiretorio.mkdir();//CRIA UM NOVO DIRETORIO
        System.out.println(isCreated);

        File arquivo = new File("arquivo/ArquivoTexto.txt");
        File arquivo2 = new File(fileDiretorio,"ArquivoTexto2.txt");
        try {
            isCreated = arquivo.createNewFile();
            System.out.println(isCreated);

            isCreated = arquivo2.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File arquivoRenamed = new File("arquivoRenomeado/arquivo_renomeado"); //GERA UM NOVO OBJETO EM OUTRO DIRETORIO
        boolean isRenamed = arquivo.renameTo(arquivoRenamed); //MOVO O ARQUIVO PARA ESSE OUTRO OBJETO E REESCREVO SEU NOME
        System.out.println(isRenamed);
    }
}
