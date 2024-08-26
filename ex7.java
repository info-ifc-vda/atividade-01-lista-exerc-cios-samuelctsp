import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;
        int num2;

        System.out.println("Informe um número inteiro para definir o intervalo:");
        num=teclado.nextInt();

        System.out.println("Informe outro número inteiro menor para definir o intervalo:");
        num2=teclado.nextInt();

        int fat=1;
        int numJ=num;
        int cont=numJ;

        
        for(int i=num2;i<=num;i++)
        {
            for(int j=1;j<=numJ;j++)
            {
                fat*=cont;
                cont--;
            }
            
            System.out.println(fat);

            numJ--;
            cont=numJ;
            fat=1;
        }
    }
}
