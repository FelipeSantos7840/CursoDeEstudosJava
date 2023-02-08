package estudofelipe.orientacaoobjeto.interfaces.dominio;

public class DatabaseLoader implements DataLoader,DataRemover {

    @Override
    public void load() {
        System.out.println("CARREGANDO DADOS DO BANCO DE DADOS");
    }

    @Override
    public void remove() {
        System.out.println("REMOVENDO DO BANCO DE DADOS");
    }
}
