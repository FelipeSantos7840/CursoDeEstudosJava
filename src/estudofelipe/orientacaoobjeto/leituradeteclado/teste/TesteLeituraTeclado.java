package estudofelipe.orientacaoobjeto.leituradeteclado.teste;


import java.util.Scanner;

public class TesteLeituraTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //OBJETO QUE COLETA DADOS

        //UTLIZAR APENAS O NEXT ELE PEGA APENAS A PRIMEIRA PALAVRA
        System.out.println("Escreva algo:");
        String text = teclado.next(); // APENAS A PRIMEIRA PALAVRA
        System.out.println("Escreva uma frase:");
        String text2 = teclado.nextLine(); // A FRASE INTEIRA
        System.out.println("Escreva uma idade: ");
        int text3 = teclado.nextInt(); //PUXA O VALOR INTEIRO
        System.out.println("Digite M ou F para o sexo: ");
        char text4 = teclado.next().charAt(0); //PRIMEIRO CARACTER


        System.out.println("");
        System.out.println("-------------");
        System.out.println("Foi escrito:");
        System.out.println("Algo: " + text);
        System.out.println("Frase: " + text2);
        System.out.println("Idade: " + text3);
        System.out.println("Caracter: " + text4);
    }
}
