import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;

        System.out.println("Informe um número para calcular o fatorial:");
        num=teclado.nextInt();
        
        int fat=1;
        int cont=num;

        for(int i=1;i<=num;i++)
        {
            fat*=cont;
            cont--;
        }

        System.out.println(fat);
    }
}
