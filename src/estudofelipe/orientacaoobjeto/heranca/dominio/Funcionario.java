package estudofelipe.orientacaoobjeto.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    //CONSTRUTOR
    public Funcionario(String nome,String cpf,double salario){//SOBREESCRITA DO CONSTRUTOR NA CLASSE FILHO
        super(nome,cpf);//CHAMAR O CONSTRUTOR DA CLASSE PAI
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario, Endereco endereco){//MAIS INFORMAÇÕES
        super(nome,cpf,endereco);
        this.salario=salario;
    }


    public void imprimir(){
        super.imprimir(); //PERMITE QUE UTILIZEMOS O IMPRIMIR DA CLASSE
                          //PESSOA

        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
