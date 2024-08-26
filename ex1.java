import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        float valH;
        int horas;

        System.out.println("Informe o valor a hora do funcionário:");
        valH=teclado.nextFloat();

        System.out.println("Informe o número de horas trabalhadas pelo funcionário:");
        horas=teclado.nextInt();

        double salBruto=0;

        salBruto=valH*horas*0.7;

        System.out.println("O salário bruto do funcionário informado é "+salBruto);


    }
}
