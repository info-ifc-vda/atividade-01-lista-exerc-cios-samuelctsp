import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num;

        System.out.println("Informe um número inteiro:");
        num=teclado.nextInt();

        int cont=0;
        
        for(int i=num;i>0;i--)
        {
            if(num%i==0)
            {
                cont++;
            }
        }

        //System.out.println(cont);

        if(cont==2)
        {
            System.out.println("É primo!");
        }else
        {
            System.out.println("Não é primo!");
        }
    }
}
