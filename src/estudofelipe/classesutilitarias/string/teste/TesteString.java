package estudofelipe.classesutilitarias.string.teste;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Felipe"; //String constant pool
        String nome2 = "Felipe";

        nome.concat(" dos Santos");
        nome2 = nome2.concat(" dos Santos");

        System.out.println(nome);//FOI CONCATENADO MAS NÃO FOI ASSOCIADO
        System.out.println(nome2);//FOI CONCATENADO E ATRIBUIDO

        String nome3 = "Felipe";
        String nome4 = new String("Felipe");

        System.out.println(nome3 == nome4);
        //O resultado é falso, porque quando criado a variavel, ela estará associada ao valor Felipe na pool de String
        //Enquanto quando criado um Objeto, ele estará com uma referencia, que leva ao nome Willian, que veio da pool
        //de String

        System.out.println(nome3 == nome4.intern());
        //Utilizando o intern, dizemos para ele pegar a String do objeto dentro da piscina de String
    }
}
