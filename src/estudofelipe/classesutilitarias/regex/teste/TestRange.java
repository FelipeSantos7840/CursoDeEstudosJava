package estudofelipe.classesutilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRange {
    public static void main(String[] args) {
        //Site recomendado para tratar REGEX https://regexr.com
        //Range
             //"[caf]" (Realiza a procura dos caracteres informados) (Semelhante ao OU)
             //"[a-zA-C]" (O traço utilizado para procurar entre em um espaço)

        //Exercicio Pratico Localizar um numero HexaDecimal dentro da String (Não completo por Faltar Quantificadores)

        //String regex = "[a-zA-C]";
        String regex = "0[xX][a-fA-F0-9]";
        String texto = "234 0x 0X Ox 0x234F 0xFFECA 932";


        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições Encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
