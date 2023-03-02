import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
       double giris,kdv,kdvli,oran;
       Scanner input=new Scanner(System.in);
        System.out.print("Hesaplanacak tutarı giriniz :");
        giris=input.nextFloat();
        boolean kosul1= giris<1000; //giriş değerini koşul oluşturarak sorguluyoruz
        boolean kosul2= giris>0; //giriş değeri için 2. defa koşul oluşturarak sorguluyoruz
        boolean sonuc= kosul1&&kosul2; //sonuc değeri için true koşullarını belirledik yani koşul1 ve 2 karşılanırsa true olacak
        oran = sonuc? 1.18:1.08; //sonuc true döndürürse 1.18 döndürmezse 1.08 değeri alacak oran
        kdvli=giris*oran;
        System.out.println("Kdvli tutar = "+kdvli);
        kdv=kdvli-giris;
        System.out.println("Kdv tutarı = "+kdv);
        System.out.println("Kdv oranı = "+oran);

    }
}
