package estudofelipe.excecoes.exchecked;

import java.io.File;
import java.io.IOException;

public class TesteTrownsChecked {
    public static void main(String[] args) {
        try{ //TRATAMENTO DA EXCEÇÃO LANÇADA PELO METODO criarNovoArquivo
            criarNovoArquivo();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("CARALHO");
        }
    }

    public static void criarNovoArquivo() throws IOException{ // AO ADICIONAR O THROWS, ESTÁ INDICANDO QUE ESSE METODO PODE ESTAR
                                                              //LANÇANDO UMA EXCEÇÃO E POR SER IOException OBRIGATORIAMENTE DEVERÁ SER
                                                              //TRATADA PELO CHAMADOR, NO CASO O MAIN

        File file = new File("pastaInexistente/teste.txt");
        try{
            boolean valid = file.createNewFile();
            System.out.println("Arquivo Criado: " + valid);
        }catch (IOException e){
            e.printStackTrace();
            throw e; //ESTOU PASSANDO PARA QUE CASO DER O ERRO, ELE REALIZAR A LEITURA COM A LINHA ACIMA
                     //E LANÇAR ELA NOVAMENTE, UTILIZANDO O TROWS NA DECLARAÇÃO DO METODO
        }

    }
}
