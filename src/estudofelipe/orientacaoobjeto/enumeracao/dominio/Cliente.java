package estudofelipe.orientacaoobjeto.enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipo;//PARA UTILIZAR FICA APENAS INDICAR UM ATRIBUTO DO MESMO TIPO
                             //QUE A CLASSE ENUMERADORA

    private TipoPagamento pagto;


    public Cliente(String nome, TipoCliente tipo, TipoPagamento pagto) {
        this.nome = nome;
        this.tipo = tipo;
        this.pagto = pagto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo + " ValorNum: " + tipo.getValor()+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
