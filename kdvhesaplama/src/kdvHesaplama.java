import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
       double giris,kdv,kdvli;
       Scanner input=new Scanner(System.in);
        System.out.print("Hesaplanacak tutarı giriniz :");
        giris=input.nextFloat();
        kdvli=giris*1.18;
        System.out.println("Kdvli tutar = "+kdvli);
        kdv=kdvli-giris;
        System.out.println("Kdv tutarı = "+kdv);

    }
}
