package estudofelipe.excecoes.excecoes.test;

public class RuntimeException {
    //CHECKED e UNCHECKED

    //Checked ocorrem principalmente em tempo de copilação, por exemplo IO e SQL
    //E se não forem tratadas, se transformam em erros

    //Unchecked ocorrem quando lançados pelo programa, significa algo não tratado
    //corretamente, geralmente associado a uma falha de desenvolvedor


    public static void main(String[] args) {
        //EXEMPLO
        Object objeto = null;
        System.out.println(objeto.toString());
        //nullPointerException

        int[] nums = {1,2};
        System.out.println(nums[2]);
        //ArrayIndexOutOfBoundsException
    }
}

