import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double tutar,karmut,kelma,kdomates,kmuz,kpatlican,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kaç kilo :");
        karmut=input.nextDouble();
        System.out.print("Elma kaç kilo :");
        kelma=input.nextDouble();
        System.out.print("Domates kaç kilo :");
        kdomates=input.nextDouble();
        System.out.print("Muz kaç kilo :");
        kmuz=input.nextDouble();
        System.out.print("Patlican kaç kilo :");
        kpatlican=input.nextDouble();
        tutar=(kelma*elma)+(karmut*armut)+(kdomates*domates)+(kmuz*muz)+(kpatlican*patlican);
        System.out.print("Tutar = "+tutar);

    }
}
