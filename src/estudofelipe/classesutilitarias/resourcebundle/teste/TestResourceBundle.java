package estudofelipe.classesutilitarias.resourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); // VISUALIZAR LOCALE DO SISTEMA

        ResourceBundle bundle = ResourceBundle.getBundle("mensagem",Locale.of("en","US"));

        boolean validarChave = bundle.containsKey("fakeChave");//VALIDA SE POSSUE UMA CHAVE COM ESSE NOME RETORNANDO FAKE/TRUE
        System.out.println(validarChave);

        //IMPRESSÃO DE CHAVE
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("frase.padrao"));

        bundle = ResourceBundle.getBundle("mensagem",Locale.getDefault());

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("frase.padrao"));

        //Ordem de Procura caso ele não encontre algum arquivo:
        // Locale ("en","US");
        // messages_en_US.properties
        // messages_en.properties
        // messages_pt_BR.properties (Caso ele não encontre na especificada ele vai procurar o padrão do Windows)
        // messages_pt.properties
        // messages.properties

    }
}
