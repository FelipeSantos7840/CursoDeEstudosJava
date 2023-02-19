package estudofelipe.classesutilitarias.datas.teste.exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

public class TemporalPersonalizado implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaPar = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int diaPlus;

        switch (diaPar){
            case FRIDAY:
                diaPlus = 3;
                break;
            case SATURDAY:
                diaPlus = 2;
                break;
            default:
                diaPlus = 1;
        }
        return temporal.plus(diaPlus,ChronoUnit.DAYS);
    }
}
