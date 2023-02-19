package estudofelipe.classesutilitarias.regex.teste;

public class TestTokenDelimitadores {
    public static void main(String[] args) {
        String texto = "Eren, Levi, Mikasa";
        String[] nomes = texto.split(",");
        for(String nome: nomes){
            nome = nome.trim();
            System.out.println(nome);
        }
    }
}
