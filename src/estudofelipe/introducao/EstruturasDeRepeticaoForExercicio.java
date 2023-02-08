package estudofelipe.introducao;

public class EstruturasDeRepeticaoForExercicio {
    //Pares em um de zero até 1 milhão
    public static void main(String[] args) {
        for (int x = 0; x < 1000000; x++) {
            System.out.println(x % 2 == 0 ? x : "");
        }

        //OU

        //for(int x=0; x < 1000000; x+=2){
          //  System.out.println(x);
        //}

        //BREAK PARANDO LAÇO

        for(int x=0; x < 1000000; x+=2){
            if (x == 25490){
                break;
            }
            System.out.println(x);
        }
        System.out.println("PAROU");
    }
}
