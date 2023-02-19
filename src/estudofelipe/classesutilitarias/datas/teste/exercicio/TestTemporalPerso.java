package estudofelipe.classesutilitarias.datas.teste.exercicio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestTemporalPerso {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();

        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfWeek());

        ldt1 = ldt1.with(new TemporalPersonalizado());
        //Ao inicializar o novo objeto do Temporal que implementa o adjustInto ele ira executar o comando
        //Relaizando o ajuste apartir da regra de negocio




        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfWeek());
    }
}
