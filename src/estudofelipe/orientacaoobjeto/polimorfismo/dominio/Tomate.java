package estudofelipe.orientacaoobjeto.polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
