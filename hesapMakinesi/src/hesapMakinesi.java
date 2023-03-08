import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select, result;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();
        if (select == 1) {
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkartma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (select == 4){
                if (n2==0) {
                    System.out.println("0 a bölünemez");
                }
                else {System.out.println("Bölme : " + (n1 / n2));
        }}else{
            System.out.println("Hatalı Seçim Yaptınız");
    }}}