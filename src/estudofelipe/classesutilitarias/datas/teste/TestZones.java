package estudofelipe.classesutilitarias.datas.teste;

import java.time.*;
import java.util.Map;

public class TestZones {
    public static void main(String[] args) {
        LocalDateTime ldt3 = LocalDateTime.now();
        //Zonas são os fusos horario de todo UTC
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); //IMPRIME OS IDS DISPONIVEIS
        System.out.println(ZoneId.systemDefault()); //IMPRIME A ZONA PADRÃO DO SISTEMA
        System.out.println("\n\n");

        ZoneId zn = ZoneId.of("Asia/Tokyo");
        ZonedDateTime ldt = LocalDateTime.now().atZone(zn); //O RETORNO NÃO É MAIS UM LOCAL DATE TIME E SIM UM ZONED DATE TIME

        System.out.println(LocalDateTime.now()); //IMPRESSÃO DE LOCALDATETIME PADRÃO
        System.out.println(LocalDateTime.now().atZone(zn)); //IMPRESSÃO COM UMA ZONA
                                                            //AO IMPRIMIR COM UMA ZONA ELE NÃO ALTERNAR DIRETAMENTE OS VALORES
                                                            //MAS INDICA O QUANTO PRECISA SOMAR PARA FICAR CORRETO DE ACORDO COM A ZULU TIME

        Instant insta = Instant.now();

        System.out.println(insta); //PUXA O PADRÃO DA UTC
        System.out.println(insta.atZone(zn));//REALIZA A ALTERAÇÃO E INDICA O HORARIO QUE FOI ALTERADO
                                             //TAMBEM RETORNA UM ZONED DATE TIME


        System.out.println("\n\n");
        //TRABALHO COM ZONAS SEM SABER EXATAMENTE QUAL A ZONA
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offs = ZoneOffset.of("-04:00");//PADRÃO DE PREENCHIMENTO QUE DEVER SER RESPEITADO
        OffsetDateTime ofDateTime = ldt3.atOffset(offs); //RETORNA OFFSET DATE TIME

        System.out.println(ofDateTime);//INDICA O TEMPO PARA AJUSTAR A ZONA MAS DIRETAMENTE PELO TEMPO SEM ESPECIFICAÇÃO
        OffsetDateTime ofDireto = OffsetDateTime.of(ldt3,offs); //GERAÇÃO DIRETO DO OFFSET DATE TIME
        System.out.println(ofDireto);

        System.out.println("\n\n");

        System.out.println(insta.atOffset(offs));//UTILIZANDO O INSTANT ELE JÁ REALIZA A OPERAÇÃO


    }
}
