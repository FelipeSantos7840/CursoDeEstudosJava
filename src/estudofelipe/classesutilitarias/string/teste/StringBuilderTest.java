package estudofelipe.classesutilitarias.string.teste;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Felipe Dos Santos";

        nome.concat(" ADS");//CONCATENAÇÃO
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();
        sb.append("Felipe").append(" Dos Santos");//CONCATENAÇÃO
        System.out.println(sb.toString());
    }
}
