package estudofelipe.introducao;

public class EstruturaDeRepeticaoBreak {
    public static void main(String[] args) {
        double valCarro = 40000;
        int maxParcela=0;

        for(int x = 1;x<=valCarro;x++){
            if(valCarro/x < 1000){
                maxParcela = x-1;
                break;
            }
            System.out.println(x+"º de: R$" + valCarro/x);
        }
        System.out.println("Pode até: " + maxParcela + " parcelas!");
    }
}
