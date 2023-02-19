package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.util.Locale;

public class TestLocale02 {
    public static void main(String[] args) {

        System.out.println(Locale.getDefault()); //PUXA PADRÃO DE DATAS ATUAL DO SISTEMA OP.

        String[] localCountry = Locale.getISOCountries();
        String[] localLenguage = Locale.getISOLanguages();

        for (String localC : localCountry){
            System.out.print(localC + " ");
        }
        System.out.println("");
        for(String localL : localLenguage){
            System.out.print(localL + " ");
        }


    }
}
