package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestDateTimeFormatter {
    public static void main(String[] args) {
        //CONCEITOS
        //Todas as vezes em que possuia a palavra Format está sendo passado de objeto para String
        //Todas as vezes em que possuia a palavra Parse está sendo passado de uma String para objeto

        LocalDate ld = LocalDate.now();


        //Formatação
        String n1 = ld.format(DateTimeFormatter.BASIC_ISO_DATE);
        String n2 = ld.format(DateTimeFormatter.ISO_WEEK_DATE);

        System.out.println(n1);
        System.out.println(n2);

        //Parse
        LocalDate ld2 = LocalDate.parse(n1,DateTimeFormatter.BASIC_ISO_DATE);
                                            //UTILIZAR QUAL FORMATAÇÃO FOI UTILIZADA AO PASSAR PARA STRING

        DateTimeFormatter formatBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");//PADRÃO PERSONALIZADO

        System.out.println(ld2.format(formatBR));

        LocalDate ldBR = LocalDate.parse(ld2.format(formatBR),formatBR);//O PARSE TAMBEM PRECISA INFORMAR O PADRÃO PERSONALIZADO

        System.out.println(ldBR);


        //Formatação com localidade

        DateTimeFormatter formatJP = DateTimeFormatter.ofPattern("yyyy/MMMM/dd", Locale.JAPAN);//PERMITE INFORMAR UMA LOCALIDADE
        System.out.println(ld2.format(formatJP));

    }
}
