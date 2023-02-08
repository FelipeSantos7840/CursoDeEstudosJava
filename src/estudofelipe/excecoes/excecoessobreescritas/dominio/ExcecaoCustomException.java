package estudofelipe.excecoes.excecoessobreescritas.dominio;

public class ExcecaoCustomException extends RuntimeException{
    //CONSTRUTORES DA EXCEÇÃO QUE LEVAM ATÉ A CLASSE THROWABLE
    public ExcecaoCustomException(){
        super("Login Invalido");
    }

    public ExcecaoCustomException(String messagem){
        super(messagem);
    }

}
