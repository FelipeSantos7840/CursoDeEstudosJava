package estudofelipe.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idd = 20;
        if (idd <= 20) {
            System.out.println("Dentro do if");
        }
        boolean resul = idd>=18;

        if(!resul){
            System.out.println("Bom Dia! Maior de Idade!");
        } else {
            System.out.println("Bom Dia! Menor de Idade!");
        }

        System.out.println("Fora do if");
    }
}
