package estudofelipe.orientacaoobjeto.enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"), //TODOS OS ATRIBUTOS DESSA CLASSE SÃO CONSTANTES
                   //SERVINDO PARA PADRONIZAR OS DADOS EM PREENCHIMENTO
    PESSOA_JURIDICA(2,"Pessoa Juridica");
    //PARA ATRIBUIR UM VALOR É NECESSARIO INDICAR UMA VARIAVEL EM BAIXO
    private final int valor;//CRIAR ATRIBUTO
    private final String nomeEnumera;
    TipoCliente(int valor,String nome){
        this.valor = valor;//MONTAR CONSTRUTOR
        this.nomeEnumera = nome;
    }
    //Quando não informado nenhum valor para enumeração é criado pela JVM um construtor basico apenas para pegarmos os valores
    //com os nomes das constantes


    public int getValor() {
        return valor;//UTILIZAR O GETTER
    }
    public String getNomeEnumera(){return nomeEnumera;}

}
