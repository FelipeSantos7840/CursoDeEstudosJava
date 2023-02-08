package estudofelipe.orientacaoobjeto.exercicioassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminaMinistrado;

    //CONSTRUTOR

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminaMinistrado) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminaMinistrado = seminaMinistrado;
    }

    //METODOS PADRÕES
    public void impressora(){
        System.out.println();
        System.out.println("PROFESSOR");
        System.out.println(this.nome);
        System.out.println(this.especialidade);

        if(this.seminaMinistrado == null) return;
        System.out.println();
        System.out.println("SEMINARIOS");
        for(Seminario sem: seminaMinistrado){
            System.out.println("\n"+sem.getTitulo());
            if(sem.getEstudantes().length != 0) {
                System.out.println("\n--Alunos do Seminario!--");
                for (Estudantes est : sem.getEstudantes())
                    System.out.println(est.getNome());
            }

            if(sem.getLocalSeminario() != null) {
                System.out.println("\n--Local do Seminario--");
                System.out.println(sem.getLocalSeminario().getEndereco());
            }
        }

    }


    //GETTER E SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminaMinistrado() {
        return seminaMinistrado;
    }

    public void setSeminaMinistrado(Seminario[] seminaMinistrado) {
        this.seminaMinistrado = seminaMinistrado;
    }
}
