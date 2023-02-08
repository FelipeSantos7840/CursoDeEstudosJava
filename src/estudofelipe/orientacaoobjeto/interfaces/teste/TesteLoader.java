package estudofelipe.orientacaoobjeto.interfaces.teste;

import estudofelipe.orientacaoobjeto.interfaces.dominio.DatabaseLoader;
import estudofelipe.orientacaoobjeto.interfaces.dominio.FileLoader;

public class TesteLoader {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
    }
}
