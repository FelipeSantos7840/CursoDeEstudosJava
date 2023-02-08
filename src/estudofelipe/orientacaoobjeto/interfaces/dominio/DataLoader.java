package estudofelipe.orientacaoobjeto.interfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){//AO UTILIZAR O DEFAULT INDICA QUE A IMPLEMENTAÇÃO ESTÁ SENDO REALIZADA
                                   //NA INTERFACE
        System.out.println("Fazendo a checagem!");
    }


}
