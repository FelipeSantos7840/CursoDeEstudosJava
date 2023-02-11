package estudofelipe.classesutilitarias.calender.teste;

import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.MONTH,-1); //Alterar o atual mês do calendario

        Date data = cal.getTime(); //Passo os milissegundos para uma date para melhor visualização
        System.out.println(data);
    }
}
