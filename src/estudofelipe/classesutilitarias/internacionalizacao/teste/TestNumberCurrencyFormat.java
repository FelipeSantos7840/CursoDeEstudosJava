package estudofelipe.classesutilitarias.internacionalizacao.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class TestNumberCurrencyFormat {
    public static void main(String[] args) {

        Locale lcDf = Locale.getDefault();
        Locale lcUK = new Locale ("en","UK");
        Locale lcJapan = Locale.JAPAN;
        Locale lcItaly = Locale.ITALY;

        NumberFormat[] nform = new NumberFormat[4];

        nform[0] = NumberFormat.getCurrencyInstance(lcDf);
        nform[1] = NumberFormat.getCurrencyInstance(lcUK);
        nform[2] = NumberFormat.getCurrencyInstance(lcJapan);
        nform[3] = NumberFormat.getCurrencyInstance(lcItaly);
        double num = 10294.45;

        for(NumberFormat nfVet: nform){
            System.out.println(nfVet.format(num));
        }

    }
}
