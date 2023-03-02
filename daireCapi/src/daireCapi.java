import java.util.Scanner;
public class daireCapi {
    public static void main(String[] args) {
        double r,pi=3.14,alan,cevre,olcu,alan2;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yaricapi = ");
        r= input.nextDouble();
        System.out.print("Merkez açının ölçüsü =");
        olcu= input.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        alan2=(pi*(r*r)*olcu)/360;
        System.out.println("Dairenin Alanı = "+alan);
        System.out.println("Dairenin Çevresi = "+cevre);
        System.out.println("Daire Diliminin Alanı = "+alan2);

    }
}
