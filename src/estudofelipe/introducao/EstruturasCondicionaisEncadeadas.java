package estudofelipe.introducao;

public class EstruturasCondicionaisEncadeadas {
    //SE IDADE MENOR QUE 15 INFANTIL
    //SE IDADE MAIOR IGUAL A 15 E MENOR IGUAL 18 JUVENIL
    //SE IDADE MAIOR IGUAL 18 ADULTO

    public static void main(String[] args) {
        int idd = 18;

        if(idd < 15){
            System.out.println("CATEGORIA INFANTIL!");
        } else if (idd >=15 && idd<18){
            System.out.println("CATEGORIA JUVENIL!");
        } else {
            System.out.println("CATEGORIA ADULTO!");
        }
    }
}
