package estudofelipe.classesutilitarias.date.teste;

import java.util.Date;

public class TesteDate {
    public static void main(String[] args) {
        //Classe antiga presente nas primeiras versões
        //Muitos metodos já estão depreciados, podendo até ser removidos, reparar nos sublinhados
        Date data = new Date(1); //Possui um long em Milli segundos
        Date dataAtual = new Date();

        System.out.println(data); //Puxa o ToString da classe Date
        System.out.println(data.getTime());

        System.out.println("Informações atuais:");

        System.out.println(dataAtual.getTime());
        System.out.println(dataAtual);
    }
}
