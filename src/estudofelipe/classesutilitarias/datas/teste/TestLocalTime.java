package estudofelipe.classesutilitarias.datas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class TestLocalTime {
    public static void main(String[] args) {
        LocalTime tempo = LocalTime.now();//INICIALIZAÇÃO
        LocalTime tempo2 = LocalTime.of(18,42,55);//INICIALIZAÇÃO

        System.out.println(tempo);
        System.out.println(tempo.getHour());
        System.out.println(tempo.getMinute());
        System.out.println(tempo.getSecond());
        System.out.println(tempo2.get(ChronoField.HOUR_OF_AMPM)); //PERMITE TRAZER AS HORAS EM FORMAS DIFERENTES
        System.out.println(tempo2.get(ChronoField.MINUTE_OF_DAY));
    }
}
