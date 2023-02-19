package estudofelipe.classesutilitarias.datas.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class TestPeriod {
    public static void main(String[] args) {
        //TRATAMENTO DE TEMPO ENTRE UM PERIODOD DE DATA
        LocalDate dt1 = LocalDate.now();
        LocalDate dt2 = LocalDate.now().plusYears(2).plusMonths(1);

        Period p1 = Period.between(dt1,dt2);//RECEBE EXCLUSIVAMENTE CLASSE LOCALDATE

        System.out.println(Period.between(LocalDate.now(),LocalDate.now().plusYears(1).plusMonths(6)));
        System.out.println(p1);
        System.out.println(dt1.until(dt2, ChronoUnit.DAYS)); //PEGA A DATA DO DT1 E CALCULA O TEMPO EM DIAS (PELO CHRONOUNIT)
                                                             //PARA CHEGAR NP DT2
    }
}
