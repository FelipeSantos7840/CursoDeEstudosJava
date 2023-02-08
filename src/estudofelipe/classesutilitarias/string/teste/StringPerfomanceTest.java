package estudofelipe.classesutilitarias.string.teste;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        StringPerformance(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de String: " + (fim-inicio) + "ms");

        System.out.println("");

        inicio = System.currentTimeMillis();
        StringBuilderPerformance(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto de StringBuilder: " + (fim-inicio) + "ms");

    }

    public static void StringPerformance(int tamanho){
        String contador = "";
        for (int i = 0; i < tamanho; i++) {
            contador+=i;
        }
    }

    public static void StringBuilderPerformance(int tamanho){
        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            strb.append(i);
        }

    }
}


