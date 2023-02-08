package estudofelipe.orientacaoobjeto.enumeracao.teste;

import estudofelipe.orientacaoobjeto.enumeracao.dominio.Cliente;
import estudofelipe.orientacaoobjeto.enumeracao.dominio.TipoCliente;
import estudofelipe.orientacaoobjeto.enumeracao.dominio.TipoPagamento;


public class TesteEnume {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubaza", TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Luffy", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
                                                            //POR SER PADRONIZADA E PUBLICA PARA INFORMA-LA
                                                            //É NECESSARIO APENAS UTILIZAR O NOMEDACLASSE.CONSTANTE

        System.out.println(cliente1.toString());//POR PADRÃO O JAVA IMPRIME O NOME DA CONSTANTE ENUMERADA
        System.out.println(cliente2.toString());
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));


    }
}
