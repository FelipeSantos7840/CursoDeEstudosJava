package estudofelipe.introducao;

public class EstruturaCondcionalExercicio {
    public static void main(String[] args) {
        double salAnual = 70000;

        if (salAnual <=34712) {
            System.out.println("Você pagará: "+salAnual*0.0970);
        } else if (salAnual <=68507){
            System.out.println("Você pagará: "+salAnual*0.3735);
        } else {
            System.out.println("Você pagará: "+salAnual*0.4950);
        }
    }
}
