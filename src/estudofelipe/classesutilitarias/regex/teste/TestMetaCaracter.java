package estudofelipe.classesutilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMetaCaracter {
    public static void main(String[] args) {
        //Site recomendado para tratar REGEX https://regexr.com
        //METAS CARACTERES
            //\d = Todos os digitos
            //\D = Tudo que não for digito (Inclui Caracteres Especiais)
            //\s = Todos os espaços em branco (\t \n \f \r)
            //\S = Todos que não for espaço em branco
            //\w = a-z|A-Z|0-9|_ (Letras, digitos e underline)
            //\W = Tudo não incluido no \w

        String regex = "\\W";
        String texto = "aaaababaaaaabaa";
        String textoComDigitos = "223ieof4jwf232ew4fg";
        String textoComDigECaracEspeciais = "2@2b3_i eof @4j%w** f$$";

        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(textoComDigECaracEspeciais);

        System.out.println("Texto: " + textoComDigECaracEspeciais);
        System.out.println("Regex: " + regex);
        System.out.println("Posições Encontradas: ");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
