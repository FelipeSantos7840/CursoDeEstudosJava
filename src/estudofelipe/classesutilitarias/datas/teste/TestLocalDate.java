package estudofelipe.classesutilitarias.datas.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class TestLocalDate {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2004,12,17);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());//ANO BISSEXTO OU NÃO
        System.out.println(date);
    }
}
