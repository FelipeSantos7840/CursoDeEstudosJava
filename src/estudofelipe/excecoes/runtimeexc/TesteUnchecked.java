package estudofelipe.excecoes.runtimeexc;

public class TesteUnchecked {
    public static void main(String[] args) {
        dividir(1,0);
    }

    public static int dividir (int a, int b){
        if(b <= 0 ){                                                    //LANÇAMENTO DE EXCEÇÃO UNCHECKED, VALIDADO ANTES
                                                                        //QUE ESTÁ INCORRETO O PROCESSO, LANÇAMOS UM EXCEÇÃO
            throw new IllegalArgumentException("Ta errado ai irmão");   //QUE PODE SER TRATADA NO CHAMADOR DO METODO
        }


        try{                            //TRATAMENTO DA EXCEÇÃO UNCHECKED
            return a/b;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("ErroTransposto");
        return 0;
    }
}
