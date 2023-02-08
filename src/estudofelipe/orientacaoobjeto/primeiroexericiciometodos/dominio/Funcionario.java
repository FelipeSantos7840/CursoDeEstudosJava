package estudofelipe.orientacaoobjeto.primeiroexericiciometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public float[] salario;

    public void imprimir() {
        if(salario == null){
            return;
        }

        System.out.println(this.nome);
        System.out.println(this.idade);

        for (int x = 0; x < salario.length; x++) {
            System.out.println(x + 1 + "º Salario: " + this.salario[x]);
        }
    }

    public void mediaSalario() {
        if(salario == null){
            return;
        }

        int media = 0;
        for (int x = 0; x < salario.length; x++) {
            media += salario[x];
        }
        media /= salario.length;
        System.out.println("A media salarial é: R$" + media);
    }
}
