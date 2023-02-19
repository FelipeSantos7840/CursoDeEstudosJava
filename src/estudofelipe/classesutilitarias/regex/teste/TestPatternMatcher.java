package estudofelipe.classesutilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternMatcher {
    public static void main(String[] args) {
        //Site recomendado para tratar REGEX https://regexr.com
        //Atraves de metas caracteres permite estabelecer padrões

        String regex = "aba";
        String texto = "aaaababaaaaabaa";

        Pattern padrao = Pattern.compile(regex); //Passamos o padrão em um Pattern
        Matcher matcher = padrao.matcher(texto); //Realiza a procura do padrão dentro do texto

        System.out.println("Texto: " + texto);
        System.out.println("Regex: " + regex);
        System.out.println("Posições Encontradas: ");
        while(matcher.find()){ //RETORNA FALSO QUANDO A PROCURA É FINALIZADA
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
                            //RETORNA O PRIMEIRO INDEX DO MATCH AO ENCONTRAR NA STRING (.start)
                                                     //RETORNA O QUE FOI ENCONTRADO (.group)

        }

    }
}
