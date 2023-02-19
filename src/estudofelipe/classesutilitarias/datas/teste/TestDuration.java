package estudofelipe.classesutilitarias.datas.teste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDuration {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraDaquiDoisAnos = LocalDateTime.now().plusYears(2);
        LocalTime agora2 = LocalTime.now();
        LocalTime agora2Apos7Horas = LocalTime.now().plusHours(7).plusMinutes(15);

        Duration d1 = Duration.between(agora,agoraDaquiDoisAnos);
        Duration d2 = Duration.between(agora2,agora2Apos7Horas);
        System.out.println(d1);
        System.out.println(d2);
        //Com o comando BETWEEN é pego a a diferença de tempo entre os dois objetos, no caso o duration trabalha
        //apenas com horas e minutos, então se passarmos a quantidade de dias ele retornaram a formatação em horas
        //O H no final da execução significa que o valor representa horas

        //Aceita apenas local DateTime e Time (NÃO FUNCIONA O DATE POIS NÃO POSSUI SEGUNDOS)


    }
}
