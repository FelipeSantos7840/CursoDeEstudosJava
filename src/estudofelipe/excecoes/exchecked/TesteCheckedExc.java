package estudofelipe.excecoes.exchecked;

import java.io.File;
import java.io.IOException;

public class TesteCheckedExc {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("pastaInexistente/teste.txt");
        try{ //Tratamento da exceção checked
            boolean valid = file.createNewFile();
            System.out.println("Arquivo Criado: " + valid);
        }catch (IOException e){
            e.printStackTrace();// Imprime a pilha de chamadas de métodos que levou a uma exceção.
                                // Isso fornece informações detalhadas sobre a localização do erro na aplicação
        }

    }
}
