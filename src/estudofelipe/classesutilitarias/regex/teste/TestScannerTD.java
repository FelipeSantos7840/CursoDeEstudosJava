package estudofelipe.classesutilitarias.regex.teste;

import java.util.Scanner;

public class TestScannerTD {
    public static void main(String[] args) {
        String texto = "Eren Levi Mikasa true 200";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(" ");//DELIMITA OS REGISTROS

        while(scan.hasNext()){

            if(scan.hasNextInt()){

                int i = scan.nextInt();
                System.out.println("Inteiro: " + i);

            } else if (scan.hasNextBoolean()){

                boolean b = scan.nextBoolean();
                System.out.println("Bollean: " + b);

            } else {

                System.out.println(scan.next());

            }

        }



    }
}
