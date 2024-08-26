import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        float salMin;
        float gasto;

        System.out.println("Informe o valor do salário mínimo atual:");
        salMin=teclado.nextFloat();

        System.out.println("Informe a quantidade em quilowatts gasto de energia na residência:");
        gasto=teclado.nextFloat();

        double valQuilo=0;
        double valPago=0;
        
        valQuilo=0.01*salMin;
        valPago=valQuilo*gasto;

        System.out.println("O valor do quilowatt é "+valQuilo+" e o valor pago pela residência informada é "+valPago);



    }
}
