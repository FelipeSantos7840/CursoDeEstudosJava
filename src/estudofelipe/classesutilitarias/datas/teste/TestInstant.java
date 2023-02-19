package estudofelipe.classesutilitarias.datas.teste;

import java.time.Instant;

public class TestInstant {
    public static void main(String[] args) {
        Instant insNow = Instant.now();
        System.out.println(insNow); //SEMELHANTE A DATETIME MAS HORARIO É REFERENTE AO UTC
                                    //ZULU TIME

        System.out.println(insNow.getEpochSecond());//SEGUNDO A PARTIR DE 1970
        System.out.println(insNow.getNano());//PEGA OS NANOS SEGUNDOS DENTRO DO ATUAL SEGUNDO
        System.out.println(Instant.ofEpochSecond(1676549087));
        System.out.println(Instant.ofEpochMilli(1));

    }
}
