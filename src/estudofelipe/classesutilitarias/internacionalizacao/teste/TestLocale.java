package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestLocale {
    public static void main(String[] args) {
        //---BASE DO LOCALE
        Locale localLot = new Locale("it","IT");//LINGUA E LOCALIDADE SEGUINDO AS ISO

        Calendar cal = Calendar.getInstance();//CRIAÇÃO DE UM CALENDARIO

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,localLot);//CRIANDO UMA FORMATAÇÃO E COLOCANDO UMA LOCALIDADE
        System.out.println(df.format(cal.getTime()));//PRINTANDO A DATA COM A LOCALIDADE
        //-----------------

        //OUTROS COMANDOS
        Locale localJapao = new Locale("ja","JP");

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localJapao);

        System.out.println(df2.format(cal.getTime()));
        System.out.println(localJapao.getDisplayCountry()); //APRESENTA O PÁIS DO LOCALE MAS COM O TRADUÇÃO BASEADO
                                                            //NO SISTEMA OPERACIONAL

        System.out.println(localJapao.getDisplayCountry(localJapao)); //COLOCANDO O PARAMETRO ELE VAI PASSAR A FORMA EM QUE É ESCRITA
                                                                      //NO PAÍS DO PARAMETRO

        System.out.println(localJapao.getDisplayName());//NOME LINGUAGEM

    }
}
