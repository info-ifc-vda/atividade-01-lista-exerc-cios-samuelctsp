import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        float l1;
        float l2;
        float l3;
        float a1;
        float a2;
        float a3;

        Scanner teclado=new Scanner(System.in);

        System.out.println("Informe o valor do lado 1 do triângulo:");
        l1=teclado.nextFloat();

        System.out.println("Informe o valor do lado 2 do triângulo:");
        l2=teclado.nextFloat();

        System.out.println("Informe o valor do lado 3 do triângulo:");
        l3=teclado.nextFloat();

        System.out.println("Informe o valor do ângulo 1 do triângulo:");
        a1=teclado.nextFloat();

        System.out.println("Informe o valor do ângulo 2 do triângulo:");
        a2=teclado.nextFloat();

        System.out.println("Informe o valor do ângulo 3 do triângulo:");
        a3=teclado.nextFloat();

        String classAng="";
        String classLa="";

        if(l1==l2 && l1==l3)
        {
            classLa="equilátero";
        }else if((l1==l2 && l1!=l3) || (l1==l3 && l1!=l2) || (l2==a3 && l2!=l1))
        {
            classLa="isósceles";
        }else if(l1!=l2 && l1!=l3 && l2!=l3)
        {
            classLa="escaleno";
        }

        if(a1<90 && a2<90 && a3<90)
        {
            classAng="acutângulo";
        }else if(a1>90 || a2>90 || a3>90)
        {
            classAng="obtusângulo";
        }else if(a1==90 || a2==90 || a3==90)
        {
            classAng="reto";
        }

        System.out.println("O trinângulo informado posssui a classificação de "+classLa+" quanto aos lados e "+classAng+" quanto aos ângulos");

    }
}
