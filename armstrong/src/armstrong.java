import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,basNumber=0,basValue,basPow,result=0;

        System.out.print("Bir Sayı Giriniz :");
        number= input.nextInt();

        int tempNumber=number; //tempnumber geçici tanımlama yapılıyor, number değeri kaybolmasın diye

        while(tempNumber!=0){
            tempNumber/=10;
            basNumber++; //sayısının kaç basamaklı olduğu bulunuyor
        }

        tempNumber=number;
        while(tempNumber!=0){ //0 a eşit olmadığı sürece while döngüsü çalıştırılıyor
            basValue=tempNumber%10; // basamakta hangi değerin (rakamın) olduğu bulunuyor
            basPow=1; //basPow değeri her döngü başlangıcında 1 e eşitleniyor
            for(int i=1;i<=basNumber;i++){ //basNUmber değerine ulaşıncaya kadar basPow u basvalue ile çarpıp üzerine ekliyor
                basPow*=basValue; //basamak sayısının üssü alınıyor
                            }
            result+=basPow; //result değerine hesaplanan üs değeri ekleniyor her defasında
            tempNumber/=10; // diğer basamağa geçiş sağlanıyor
        }
        if(result==number){
            System.out.println(number+ " armstrong bir sayıdır");
        }else{
            System.out.println(number+" armstrong değildir");
        }





    }
}
