package estudofelipe.orientacaoobjeto.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("CARREGANDO ARQUIVO");
    }

    @Override
    public void remove() {
        System.out.println("DELETANDO DADOS DE ARQUIVO");
    }
}
