package estudofelipe.classesutilitarias.datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TestChronoUnit {
    public static void main(String[] args) {
        LocalDateTime aniv1 = LocalDateTime.of(2004, Month.DECEMBER,17,8,50,32);
        LocalDate aniv2 = LocalDate.of(2004,12,17);
        LocalTime time1 = LocalTime.of(07,16,23);

        //PERMITE PESQUISAR ENTRE DATAS E HORAS UTILIZANDO UMA VARIAVEL ESPECIFICA(DIAS, MESES, HORAS...)

        System.out.println(ChronoUnit.DAYS.between(aniv1,LocalDateTime.now()));//DIA COM LOCAL DATE TIME
        System.out.println(ChronoUnit.DAYS.between(aniv2,LocalDate.now()));//DIA COM LOCAL DATE
        System.out.println(ChronoUnit.HOURS.between(aniv1,LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniv2,LocalDate.now()));
        System.out.println(ChronoUnit.YEARS.between(aniv2,LocalDate.now()));
        System.out.println(ChronoUnit.SECONDS.between(time1,time1.plusHours(2).plusMinutes(76)));
    }
}
