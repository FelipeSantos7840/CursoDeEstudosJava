package estudofelipe.excecoes.trywithresources.dominio;

import java.io.Closeable;

public class Leitor1 implements Closeable {
    @Override
    public void close(){
        System.out.println("Fechando a chamada 1");
    }
}
