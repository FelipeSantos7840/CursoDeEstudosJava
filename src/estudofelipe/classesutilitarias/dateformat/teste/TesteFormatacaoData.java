package estudofelipe.classesutilitarias.dateformat.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteFormatacaoData {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date dat = cal.getTime();

        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat data: df){
            System.out.println(data.format(dat));
        }
    }
}
