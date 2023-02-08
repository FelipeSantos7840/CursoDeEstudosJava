package estudofelipe.introducao;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        //Imprima o dia da semana considerando 1 como Domingo
        int dia = 10;

        switch (dia){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Segunda-Feira"); break;
            case 3:
                System.out.println("Terça-Feita"); break;
            case 4:
                System.out.println("Quarta-Feira"); break;
            case 5:
                System.out.println("Quinta-Feira"); break;
            case 6:
                System.out.println("Sexta-Feira"); break;
            case 7:
                System.out.println("Sabado"); break;
            default:
                System.out.println("Valor Incorreto"); //PODE MUDAR A POSIÇÃO
        }
    }
}
