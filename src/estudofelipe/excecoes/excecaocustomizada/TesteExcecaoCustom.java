package estudofelipe.excecoes.excecaocustomizada;

import java.util.Scanner;

public class TesteExcecaoCustom {
    public static void main(String[] args) {
        try{
            fazerLogin();
        } catch (ExcecaoCustomException e){
            e.printStackTrace();
            fazerLogin();
        }
    }

    private static void fazerLogin(){
        Scanner teclado = new Scanner(System.in);

        String userDB = "FelipinKK";
        String senhaDB = "1324";

        System.out.println("Informe seu usuario: ");
        String user_digitado = teclado.nextLine();

        System.out.println("Informe sua senha: ");
        String senha_digitado = teclado.nextLine();

        if(!user_digitado.equals(userDB) || !senha_digitado.equals(senhaDB)){
            throw new ExcecaoCustomException();
        }
    }
}
