package estudofelipe.introducao;

public class ArraysMultidimensionaisInicializacao {
    public static void main(String[] args) {
        //DECLARAÇÃO PARCIAL
        int[][] arrayBase = new int[2][];

        //TIPOS DE INICIALIZAÇÃO
        arrayBase[0] = new int[3];
        arrayBase[0][0] = 45;
        arrayBase[0][1] = 46;
        arrayBase[0][2] = 47;
        arrayBase[1] = new int[]{21,10,30,21}; //PODEM POSSUIR TAMANHO DIFERENTES

        //DIRETO NA DECLARAÇÃO
        int[][] arraIni = {{1,2},{1,2,3,4},{3,2,5,7,1}}; //TAMBEM COM TAMANHOS DIFERENTES

        //APRESENTAÇÃO
        for(int x=0;x<arrayBase.length;x++){
            for(int y=0;y<arrayBase[x].length;y++){
                System.out.println(arrayBase[x][y]);
            }
        }
    }
}
