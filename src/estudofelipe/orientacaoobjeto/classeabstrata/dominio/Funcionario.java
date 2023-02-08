package estudofelipe.orientacaoobjeto.classeabstrata.dominio;

public abstract class Funcionario extends Pessoa {
    // 1 - Ao indicar ABSTRACT não poderá ser instanciado um objeta da mesma
    //criada com o objetivo de ser extendida

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus(); //AO CHAMAR ESSE METODO ABSTRATO, SEUS OBJETOS O EXECUTARÃO COM SEUS RESPECTIVOS CODIGOS
    }

    public abstract void calculaBonus();
    //NUNCA PODERA POSSUIR UM METODO ABSTRATO EM UMA CLASSE NÃO ABSTRATA

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
