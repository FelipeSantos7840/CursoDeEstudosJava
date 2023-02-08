package estudofelipe.classesutilitarias.string.teste;

import java.util.Locale;

public class StringTeste02 {


    public static void main(String[] args) {
        String nome = "Luffy";
        String nome2 = "    Luffy     ";
        System.out.println(nome.charAt(0)); //RETORNA A LETRA A PARTIR DA POSIÇÃO INDEX
        System.out.println(nome.length());//METODO QUE RETORNA O TAMANHA DA STRING
        System.out.println(nome.replace("f","l"));//REALIZA A TROCA DE LETRAS ESPECIFICAS
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.substring(0,2));//RETORNA UMA STRING A PARTIR DO INTEVALO SELECIONADO
                                                //SE ATENTAR AO FINAL, POIS ELE NÃO UTILIZARA O QUE ESTÁ NA POSIÇÃO 2

        System.out.println(nome2.trim()); //REMOVE OS ESPAÇOS EM BRANCOS NO COMEÇO E NO FINAL DA STRING
    }
}
