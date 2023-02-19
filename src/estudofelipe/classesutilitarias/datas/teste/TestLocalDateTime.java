package estudofelipe.classesutilitarias.datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDT = LocalDateTime.now();

        LocalDate localD = LocalDate.of(2023, Month.JULY, 13);  //INCIALIZAÇÃO CONVENCIONAL
        LocalTime localT = LocalTime.now(); //INCIALIZAÇÃO CONVENCIONAL
        localD = LocalDate.parse("2023-03-19"); //INCIALIZAÇÃO COM STRING
        localT = LocalTime.parse("12:23:00");  //INCIALIZAÇÃO COM STRING


        System.out.println(localDT);
        System.out.println(localD);
        System.out.println(localT);

        //TRANSFORMAR DATE E TIME EM UM LOCALDATETIME

        localDT = localD.atTime(localT);

        System.out.println(localDT);

    }
}
