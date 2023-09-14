import java.util.Scanner;

public class Main {
    static int sum(int a, int b){
        int result =a+b;
        System.out.println("Sonuç : "+result);
        return result;
    }
    static int minus(int a,int b){
        int result = a -b;
        System.out.println("Sonuç : "+ result);
        return result;
    }
    static int times(int a, int b){
        int result = a*b;
        System.out.println("Sonuç : " +result);
        return result;
    }
    static int bolme(int a,int b){
        if (b==0){
            System.out.println("Bolen 0 dan büyük olmalıdır");
            return 1;
        }
        int result = a / b;
        System.out.println("Sonuç :" + result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i =1;i<=b;i++){
            result*=a;
        }
        System.out.println("Sonuç :" + result);
        return result;
    }

    static int mod(int a,int b){
      return a%b;
    }
    static void rectangle(int a, int b){
        System.out.println("Alan = " + a*b);
        System.out.println("Çevre = " +(2*(a+b)));
    }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int select;

        String menu = "1-Toplama\n" +
                "2-Çıkartma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Üs Hesaplama\n" +
                "6-Mod Alma\n" +
                "7-Dikdörtgen Alan ve Çevresi\n" +
                "0-Çıkış";
        System.out.println(menu);
while(true){
    System.out.print("İşlem Seçiniz : ");
    select = input.nextInt();

    if (select ==0){
        break;
    }

        System.out.print("Birinci Sayı : ");
        int a = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int b= input.nextInt();
    switch( select){
        case 1:
            sum(a,b);
            break;
        case 2:
            minus(a,b);
            break;
        case 3:
            times(a,b);
            break;
        case 4:
            bolme(a,b);
            break;
        case 5:
            power(a,b);
            break;
        case 6:
            System.out.println("Sonuç : "+ mod(a,b));
            break;
        case 7:
            rectangle(a,b);
            break;
        default:
            System.out.println("Hatalı Giriş");
    }
}
        System.out.println("Çıkış Yaptınız");
        }
}