package estudofelipe.classesutilitarias.wrappers.teste;

public class TesteWrappers {
    public static void main(String[] args) {

        //PRIMITIVOS
        //Boas praticas indicam que quando possivel utilizar o Tipo Primitivo
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 1l;
        float floatPrimitivo = 1.0f;
        double doublePrimitivo = 1.0d;
        char charPrimitivo = 'a';
        boolean booleanPrimitivo = false;

        //WRAPPERS
        //Nesse momento ele são objetos, sendo tratados como referencias
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1l;
        Float floatW = 1.0f;
        Double doubleW = 1.0d;
        Character charW = 'a';
        Boolean booleanW = false;

        //TERMOS DE ATRIBUIÇÃO
        Integer wrapInt = 25; //BOXING/AUTOBOXING - Atribuindo valor primitivo em uma Wrapper
        int primitInt = intW; //UNBOXING - Atribuind valor Wrapper em uma variavel primitiva

        //OPERAÇÕES
        Integer intW2 = Integer.parseInt("1"); //Transforma o caracter da String e passa para int
        charW = Character.toUpperCase('a'); //Passa o caracter para maiusculo

    }
}
