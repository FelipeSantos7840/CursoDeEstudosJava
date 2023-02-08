package estudofelipe.excecoes.runtimeexc;

public class TesteMultiplasExcUmCacth {
    public static void main(String[] args) {
        try{
            System.out.println("Dentro do Try");
        } catch(IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro da IllegalArgumentException | ArithmeticException | ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e){
            System.out.println("Dentro da RuntimeException");
        }

        //Dessa maneira podemos tratas diversas exceções simultaneamentes, mas em troca o tratamento das três sera o mesmo
    }
}
