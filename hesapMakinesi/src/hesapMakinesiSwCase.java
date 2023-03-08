import java.util.Scanner;
public class hesapMakinesiSwCase {
    public static void main(String[] args) {
        int n1,n2,secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı Giriniz : ");
        n1= input.nextInt();
        System.out.print("Lütfen 2. Sayıyı Giriniz : ");
        n2= input.nextInt();
        System.out.println("Yapılacak İşlemi Seçiniz\n 1-Toplama\n 2-Çıkartma\n 3-Çarpma\n 4-Bölme");
        secim= input.nextInt();
        switch (secim){
            case 1:
                System.out.println("Sonuç = " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç = " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç = " + (n1*n2));
                break;
            case 4:
                if(n2==0) {
                    System.out.println("Bir sayı 0'a bölünemez");
                }else System.out.println("Sonuç =" + n1/n2);
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız");
        }
    }
}
