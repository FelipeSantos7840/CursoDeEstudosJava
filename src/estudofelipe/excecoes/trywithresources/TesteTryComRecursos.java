package estudofelipe.excecoes.trywithresources;

import estudofelipe.excecoes.trywithresources.dominio.Leitor1;
import estudofelipe.excecoes.trywithresources.dominio.Leitor2;

import java.io.*;

public class TesteTryComRecursos {
    public static void main(String[] args) {
        lerArquivoExemplo();
    }
    //CODIGO UTILIZANDO TRYWITHRESOURCES
    public static void lerArquivoTryResources(){

        //REGRAS
        //1 - Só é possivel utilizar o TryResources se a classe instaciada implementa
        //a Interface Closeable/AutoCloseable, fazendo com que o java o chame automaticamente

        //2 - É possivel dessa maneira fazer o try sem catch mas é preciso lançar o throw
        try(Reader reader = new BufferedReader(new FileReader("texto.txt"))){
            System.out.println("Abrindo Arquivo");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //CODIGO DE MANEIRA EXTENSA
    public static void lerArquivo(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("texto.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            //DESSA MANEIRA É PERIOGOSO OCORRER A EXCEÇÃO E NEM SEQUER SER REALIZADO A
            //ABERTURA DO ARQUIVO, CAUSANDO TAMBEM A EXCEÇÃO DO CLOSE
            try {
                reader.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    //EXEMPLO DE MULTIPLAS VARIAVEIS
    public static void lerArquivoExemplo(){
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2() ){
            //DESSA MANEIRA PDOEMOS COLOCAR MULTIPLOS OBJETOS NO TRY
            //A ORDEM DE FECHAMENTO DOS ARQUVIOS SÃO INVERTIDOS DOS DECLARADOS NO TRY
            if(false){
                throw new IOException();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
