import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int [] numeros =new int[10];
        int cont=0;
        int contNum=0;

        for(int i=0;i<10;i++)
        {
            System.out.println("Informe o número "+(i+1)+":");
            numeros[i]=teclado.nextInt();

            for(int j=numeros[i];j>0;j--)
            {
                if(numeros[i]%j==0)
                {
                    cont++;
                }
            }

            if(cont==2)
            {
                contNum++;
            }

            cont=0;
        }

        System.out.println("Foram informados "+contNum+" números primos");
        
    }
}
