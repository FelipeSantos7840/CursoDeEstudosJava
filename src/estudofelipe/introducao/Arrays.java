package estudofelipe.introducao;

public class Arrays {
    public static void main(String[] args) {
        //ARRAYS PARA DECLARAR SÃO SEMPRE REFERENCES
        //SOMENTES REFERENCES PODEM SER INICIALIZADO COM NULO

        //INCIALIZAÇÃO
        int[]idade1 = new int[3];
        int[]idade2 = {14,13,25,15};
        int[]idade3 = new int[]{14,13,25,15};


        //ATRIBUIÇÃO
        idade1[0] = 21;
        idade1[1] = 15;
        idade1[2] = 11;

        //SAÍDAS
        for(int x=0;x<idade3.length;x++){
            System.out.println(idade3[x]);
        }
        System.out.println("Print por Forreach:");
        //FORREACH
        for(int num:idade2){
            System.out.println(num);
        }
    }
}
