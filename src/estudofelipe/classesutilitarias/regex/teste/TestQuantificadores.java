package estudofelipe.classesutilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQuantificadores {
    public static void main(String[] args) {
        //Site recomendado para tratar REGEX https://regexr.com
        //QUANTIFICADORES
            // ? ( zero ou uma ocorrencia)
            // * ( zero ou mais ocorrencias)
            // + ( uma ou mais ocorrencias)
            // {n,m} ( de n até m ocorrencias)
            // () ( agrupamento)
            // | ( funciona da seguinte maneira -> o(c|v)o = ovo ou oco )
            // $ (Fim da linha)
            // . (Coringa) (Exemplo: 1.3 = 123, 1E3, 1$3 (Qualquer Caracter entre 1 e 3))
            // ^ (Se utilizado no começo, indica o começo da linha, dentro de [] indica negação)

        //Exercicio Pratico Localizar um numero HexaDecimal dentro da String


        String regex = "([a-zA-Z0-9\\.-_])+@([a-zA-Z])+(\\.([a-zA-Z0-9])+)+"; //RESOLVIDO
        String texto = "luffy@hotmail.com isagi@gmail.com.br 4@#sjotaro123@gmail.com sakura@email";

        //Para validar se a string bate com a expressão regular temos .matches

        System.out.println("4@#sjotaro123@gmail.com".matches(regex)); //AO EXECUTAR ELE VAI PRINTAR QUE É FALSO
        String[] emails = texto.split(" ");//DIVIDE OS EMAIL EM UMA ARRAY BASEADO NOS ESPAÇOS
        for(String base : emails){
            System.out.println(base);
        }

        System.out.println("\n\n");

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
