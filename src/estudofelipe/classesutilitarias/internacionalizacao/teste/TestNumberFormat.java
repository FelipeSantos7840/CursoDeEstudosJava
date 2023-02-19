package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberFormat {
    public static void main(String[] args) {

        Locale lcDf = Locale.getDefault();
        Locale lcUK = new Locale ("en","UK");
        Locale lcJapan = Locale.JAPAN;
        Locale lcItaly = Locale.ITALY;

        NumberFormat[] nform = new NumberFormat[4];

        nform[0] = NumberFormat.getInstance(lcDf);
        nform[1] = NumberFormat.getInstance(lcUK);
        nform[2] = NumberFormat.getInstance(lcJapan);
        nform[3] = NumberFormat.getInstance(lcItaly);
        double num = 10294.45;

        for(NumberFormat nfVet: nform){
            System.out.println(nfVet.format(num));
        }

    }
}
