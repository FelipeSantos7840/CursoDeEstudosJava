package estudofelipe.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //ESCRITA DA MATRIZ
        int[][] dias = new int[2][3];

        //INCIALIZAÇÃO BASICA
        dias[0][0] = 28;
        dias[0][1] = 31;
        dias[0][2] = 29;

        dias[1][0] = 23;
        dias[1][1] = 19;
        dias[1][2] = 12;



        //VARIAVEL .LENGHT MUITO UTIL
        //PODE SER UTILIZADO PARA APRESENTAÇÃO DO FOR DA SEGUINTE FORMA
        for(int x=0; x< dias.length;x++){
            for(int z=0; z<dias[x].length;z++){
                System.out.println(dias[x][z]);
            }
        }
        System.out.println("Imprimir For Reach:");
        //FORREACH
        for(int[] arrBase: dias){ //PEGA O ENDEREÇO PRINCIPAL
            for(int arr: arrBase){ //PEGA OS FILHOS DO ENDEREÇO PRINCIPAL
                System.out.println(arr); //PRINTA
            }
        }
    }
}
