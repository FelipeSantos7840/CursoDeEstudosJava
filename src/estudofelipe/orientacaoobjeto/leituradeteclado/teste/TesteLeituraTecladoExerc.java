package estudofelipe.orientacaoobjeto.leituradeteclado.teste;

import java.util.Scanner;

public class TesteLeituraTecladoExerc {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Software de Previsão!");
        System.out.println("Digite sua pergunta que eu responderei:");
        String pergunta = teclado.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

    }
}
