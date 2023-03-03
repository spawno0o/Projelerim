import java.util.Scanner;

public class kitleendeksi {
    public static void main(String[] args) {
        double kilo,boy,endeks;
        Scanner input= new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        kilo = input.nextDouble();
        System.out.print("Boyunuzu Giriniz (metre cinsinden) : ");
        boy = input.nextDouble();
        endeks=kilo/(boy*boy);
        System.out.println("Vücut Kilo Endeksiniz : "+endeks);
    }
}
