package estudofelipe.excecoes.runtimeexc;

public class TesteMultiplasExcecoes {
    public static void main(String[] args) {
        try{
            System.out.println("Multiplas Exceções");
            throw new RuntimeException();
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (ArrayStoreException e){
            System.out.println("Dentro do ArrayStoreException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        //REGRAS
        //1 - Em multiplas exceções caso não atenda a nenhuma descritas
        //irá estourar uma exceção parando o programa

        //2 - Para impedir a 1, é recomendado o uso de uma classe generica para
        //capturar uma exceção não tratada, mas a genérica deve estar SEMPRE no final
        //para não inutilizar as outras exceções especializadas
    }
}
