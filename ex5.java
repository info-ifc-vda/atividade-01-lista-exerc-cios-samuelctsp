import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int [] idade =new int[3];
        float [] peso=new float[3];
        float [] altura=new float[3];

        int Inf18=0;
        float mediaIdade=0;
        float mediaAltura=0;
        float mais80=0;
        
        for(int j=0;j<2;j++)
        {
            for(int i=0;i<3;i++)
            {
                System.out.println(("Infore a idade do jogador "+(i+1)+" do TIME "+(j+1)+":"));
                idade[i]=teclado.nextInt();

                System.out.println(("Infore o peso do jogador "+(i+1)+" do TIME "+(j+1)+":"));
                peso[i]=teclado.nextFloat();

                System.out.println(("Infore a altura do jogador "+(i+1)+" do TIME "+(j+1)+":"));
                altura[i]=teclado.nextFloat();

                if(idade[i]<18)
                {
                    Inf18++;
                }

                mediaIdade+=idade[i];

                if(peso[i]>80)
                {
                    mais80++;
                }

                mediaAltura+=altura[i];
            
            }

            System.out.println("Foram "+Inf18+" jogadores com idade inferior a 18 no TIME "+(j+1));
            System.out.println("A média das idades do TIME "+(j+1)+" é "+mediaIdade/3.0);

            mediaIdade=0;
            Inf18=0;    
        }
        System.out.println("A média das alturas dos jogadores dos times é "+mediaAltura/6.0);
        System.out.println("A porcentagem de jogadores com mais de 80 quilos nos times é "+(mais80/6.0)*100+"%");
    }
}
