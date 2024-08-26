import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        float valor;
        float recebido;

        System.out.println("Informe o valor do produto em reais:");
        valor=teclado.nextFloat();

        System.out.println("Informe o valor recebido em reais:");
        recebido=teclado.nextFloat();

        float troco=recebido-valor;
        int contaCedulas=0;
        int [] cedulas={200,100,50,20,10,5,2};

        for(int cedula:cedulas)
        {
            contaCedulas=(int)troco/cedula;

            if(contaCedulas>0)
            {
                System.out.println("O troco do tem "+contaCedulas+" notas de R$ "+cedula);
                
                troco=troco%cedula;
            }
        }
        /*
        contaCedulas=(int)troco/200;
        System.out.println("O valor do tem "+contaCedulas+" notas de 200");
        troco=troco%200;

        contaCedulas=(int)troco/100;
        System.out.println("O valor do tem "+contaCedulas+" notas de 100");
        troco=troco%100;

        contaCedulas=(int)troco/50;
        System.out.println("O valor do tem "+contaCedulas+" notas de 50");
        troco=troco%50;

        contaCedulas=(int)troco/20;
        System.out.println("O valor do tem "+contaCedulas+" notas de 20");
        troco=troco%10;

        contaCedulas=(int)troco/10;
        System.out.println("O valor do tem "+contaCedulas+" notas de 10");
        troco=troco%20;

        contaCedulas=(int)troco/5;
        System.out.println("O valor do tem "+contaCedulas+" notas de 5");
        troco=troco%5;

        contaCedulas=(int)troco/2;
        System.out.println("O valor do tem "+contaCedulas+" notas de 2");
        troco=troco%2;
    */
    }
}
