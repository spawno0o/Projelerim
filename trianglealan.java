import java.util.Scanner;

public class trianglealan {
    public static void main(String[] args) {
        double a,b,c,alan,u;
        Scanner burak =new Scanner(System.in);
        System.out.print("1.kenar uzunluğunu giriniz :");
        a=burak.nextDouble();
        System.out.print("2.kenar uzunluğunu giriniz :");
        b=burak.nextDouble();
        System.out.print("3.kenar uzunluğunu giriniz :");
        c=burak.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan= "+alan);


    }
}
