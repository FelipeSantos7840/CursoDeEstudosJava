package estudofelipe.classesutilitarias.io.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");

        try{
            boolean existed = file.exists();
                                    //Verifica se o arquivo existe retornando um boolean

            if(existed){
                boolean isDeleted = file.delete();
                                        //Deleta um arquivo, caso não encontre o arquivo apenas retorna false
                System.out.println(isDeleted);
            }


            boolean arquivoCriado = file.createNewFile();
                                        //Ao utilizar o CreateNewFile ele não sobreescreverá um arquvio já criado
                                        //retornando apenas false
            System.out.println(arquivoCriado);

            //COMANDOS PATH
            System.out.println("Caminho: " + file.getPath());
            System.out.println("Caminho Absoluto: " + file.getAbsolutePath());

            System.out.println("É um diretorio? " + file.isDirectory());
            System.out.println("É um arquivo? " + file.isFile());
            System.out.println("É oculto? " + file.isHidden());
            System.out.println("Ultima vez modificado: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_DATE));


        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
