package estudofelipe.orientacaoobjeto.enumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {//IMPLEMENTAÇÃO DO METODO
            return valor*0.1;                       //RETORNO 10% DO VALOR
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valor){
            return valor*0.05;
        }
    };

    public double calcularDesconto(double valor){
        return 0;
    }
}
