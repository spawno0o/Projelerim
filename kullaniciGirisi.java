import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String kullaniciAdi,sifre,sifre2;
int answer = 0;

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        kullaniciAdi= input.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        sifre= input.nextLine();

        if(kullaniciAdi.equals("Burak")&&sifre.equals("123456")){
            System.out.println("Başarıyla Giriş Yaptınız");
        }else if(kullaniciAdi.equals("Burak")&&!sifre.equals("123456")) {
            System.out.println("Şifreniz Hatalı \n Şifrenizi Değiştirelim mi? \n 1-Evet \n 2-Hayır");
            answer = input.nextInt();
            switch (answer) {
                case 2:
                    System.out.println("İşlem İptal Edildi");
                    break;
                case 1:
                    Scanner input1=new Scanner(System.in);
                    System.out.println("Yeni Şifre Giriniz");
                    sifre2 = input1.nextLine();
                    if (sifre2.equals(sifre) || sifre2.equals("123456")) {
                        System.out.println("Şifre Oluşturulamadı");
                    } else System.out.println("Şifre Oluşturuldu");
                    break;
                default:
                    System.out.println("Şifre Değişikliği Başarısız");
            }
        }else System.out.println("Giriş Başarısız");


    }
}
