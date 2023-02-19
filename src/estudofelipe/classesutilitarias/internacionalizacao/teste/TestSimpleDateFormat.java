package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) {
        String padrao = "'Teste:' yy'-'MM'-'dd "; //FORMATAÇÃO CUSTOMIZADA
                                                  //PEGAR NA DOCUMENTAÇÃO
        SimpleDateFormat spDateFormat = new SimpleDateFormat(padrao);

        System.out.println(spDateFormat.format(new Date()));
    }
}
