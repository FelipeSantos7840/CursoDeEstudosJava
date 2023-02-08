package estudofelipe.introducao;

public class Operadores {
    public static void main(String[] args) {
        //+ - / *
        int num1 = 15;
        int num2 = 25;

        System.out.println(num1+num2);
        System.out.println("Valor: "+num1+num2);
        System.out.println(num2-num1);
        System.out.println(num2/num1);
        System.out.println(num1*num2);
        System.out.println("");
        //%
        int rest = 20/3;
        System.out.println(rest);

        // < > <= >= == !=
        boolean var1 = 20 > 35;
        boolean var2 = 35 > 29;
        boolean var3 = 15==15;
        boolean var4 = 13!=43;
        System.out.println("20 > 35? "+var1);
        System.out.println("35 > 29? "+var2);
        System.out.println("15 == 15? "+var3);
        System.out.println("13 != 43?"+var4);

        //&&(AND) ||(OR) !(NOT)

        //= += -= *= /= %=

        //x++ x-- ++x --x 
    }
}
