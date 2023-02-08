package estudofelipe.orientacaoobjeto.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int n1, int n2){ // BOAS PRATICAS
        System.out.println(n1*n2);                     // METODOS COM MAIS DE TRÊS PARAMETROS INDICAM QUE ESTÁ FAZENDO
                                                       // COISAS D+, PROCURAR DIVIDIR O METODO
    }

    public double divideDoisNumeros(double n1, double n2){
        if(n2 == 0){return 0;}

        double res = n1/n2;
        System.out.println(res);
        return res;
    }

    public void somarVarArgs(String nome,int... vet){ //VARARGS VETOR DE VALORES
        int soma =0;        //SE TIVER MAIS PARAMETROS O VARARGS PRECISA SER O ULTIMO

        for(int x=0;x<vet.length;x++){
            soma+=vet[x];
        }
        System.out.println(nome + soma);
    }
}
