import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input=new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz");
        mat= input.nextInt();

        System.out.println("fizik notunuz girin");
        fizik=input.nextInt();

        System.out.println("kimya notunuzu girin");
        kimya= input.nextInt();

        System.out.println("turkce notunuzu girin");
        turkce= input.nextInt();

        System.out.println("tarih notunuzu girin");
        tarih= input.nextInt();

        System.out.println("muzik notunuzu girin");
        muzik= input.nextInt();

        int ortalama = ((mat + fizik+kimya+turkce+tarih+muzik)/6);
        System.out.println("Ortalamanız : " + ortalama);

        boolean a= ortalama>=60;
        String burak = a? "geçti":"kaldı";
        System.out.println(burak);

    }
}
