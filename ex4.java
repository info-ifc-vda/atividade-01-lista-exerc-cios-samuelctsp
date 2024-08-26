import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int codigo;
        int quant;

        System.out.println("Infore o código do produto comprado:");
        codigo=teclado.nextInt();

        System.out.println("Infore a quantidade do produto comprado:");
        quant=teclado.nextInt();

        double preco=0;

        if(codigo>0 && codigo<=10)
        {
            preco=10;
        }else if(codigo>10 && codigo<=20)
        {
            preco=15;
        }else if(codigo>20 && codigo<=30)
        {
            preco=20;
        }else if(codigo>30 && codigo<=40)
        {
            preco=40;
        }

        System.out.println("O preco unitário do produto informado é "+preco);

        double precoTot=0;
        precoTot=preco*(double)quant;

        System.out.println("O preco total da nota é "+precoTot);

        double desconto=0;

        if(preco<=250)
        {
            desconto=0.05;
        }else if(preco>250 && preco<=500)
        {
            desconto=0.1;
        }else if(preco>500)
        {
            desconto=0.15;
        }

        double precoTotDes=0;
        precoTotDes=precoTot*(1-desconto);

        System.out.println("O valor do desconto é "+(desconto*100)+"%");
        System.out.println("O valor final da nota é "+precoTotDes);
    }
}
