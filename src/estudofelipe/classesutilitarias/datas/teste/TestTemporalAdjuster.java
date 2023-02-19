package estudofelipe.classesutilitarias.datas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TestTemporalAdjuster {
    public static void main(String[] args) {
        //AJUSTE DE HORARIO PARA DATAS ESPECIFICAS
        LocalDate nowAjusteNormal = LocalDate.now();
        LocalDate nowAjusteField = LocalDate.now();


        nowAjusteNormal = nowAjusteNormal.withMonth(1); //!!SETA!! QUE O MÊS É JANEIRO
        System.out.println(nowAjusteNormal);

        nowAjusteField = nowAjusteField.with(ChronoField.MONTH_OF_YEAR, 1);
                                            //PRIMEIRO É ESCOLHIDO O QUE DEVE SER AJUSTADO
                                            //APÓS ISSO ESCOLHIDO PARA QUAL VALOR DEVER SER AJUSTADO
        System.out.println(nowAjusteField);

        System.out.println("\n\n");


        //TEMPORAL ADJUSTERS

        LocalDate nowAjusteTemporal = LocalDate.now();

        nowAjusteTemporal = nowAjusteTemporal.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)); //SE HOJE FOR SABADO RETORNA A DATA
                                                                                            //DO MESMO DIA
        System.out.println(nowAjusteTemporal);

        nowAjusteTemporal = nowAjusteTemporal.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)); //RETORNA EXPECIFICAMENTE O PROXIMO SABADO
        System.out.println(nowAjusteTemporal);

        nowAjusteTemporal = nowAjusteTemporal.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)); //RETORNA EXPECIFICAMENTE O SABADO PASSADO
        System.out.println(nowAjusteTemporal);

        nowAjusteTemporal = nowAjusteTemporal.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(nowAjusteTemporal);
        System.out.println(nowAjusteTemporal.getDayOfWeek());

    }
}
