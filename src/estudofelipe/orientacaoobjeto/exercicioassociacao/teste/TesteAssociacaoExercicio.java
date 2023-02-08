package estudofelipe.orientacaoobjeto.exercicioassociacao.teste;

import estudofelipe.orientacaoobjeto.exercicioassociacao.dominio.Estudantes;
import estudofelipe.orientacaoobjeto.exercicioassociacao.dominio.Local;
import estudofelipe.orientacaoobjeto.exercicioassociacao.dominio.Professor;
import estudofelipe.orientacaoobjeto.exercicioassociacao.dominio.Seminario;


public class TesteAssociacaoExercicio {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Local local2 = new Local("Rua das BiruleibeLeibe");
        Estudantes aluno = new Estudantes("Felipe da Silva",20);
        Estudantes aluno1 = new Estudantes("Carlos Gomes",19);
        Professor profes = new Professor("Manuel Diguis","Matematico");
        Estudantes[] alunos = new Estudantes[]{aluno,aluno1};
        Seminario seminario = new Seminario("Local do One Piece",alunos);
        Seminario seminario2 = new Seminario("Local de Alabasta",alunos);

        seminario.setLocalSeminario(local);
        seminario2.setLocalSeminario(local2);

        Seminario[] seminarios = {seminario,seminario2};
        profes.setSeminaMinistrado(seminarios);

        profes.impressora();
    }
}
