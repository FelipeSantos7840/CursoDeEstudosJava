package estudofelipe.introducao;

public class EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {
        //Imprima os valores de 1 a 7, imprima se é dia util  ou final de semana

        byte dia = 3;

        switch (dia){
            case 1,7:
                System.out.println("Final de Semana!"); break;
            case 2,3,4,5,6:
                System.out.println("Dia Útil!"); break;
            default: //BOA PRATICA DEIXAR COMO OPÇÃO INVALIDA!
                System.out.println("Opção Invalida!");
        }
    }
}
