import java.util.Scanner;
public class zodiac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int year,zodiac=0;
        String burc="";

        System.out.print("Doğum Yılınızı Giriniz : ");
        year= input.nextInt();
        if(year>=1&&year<=9999){

        zodiac=year%12;

        switch(zodiac){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Köpek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Öküz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavşan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yılan";;
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
            default:
        }}if(zodiac>0&&zodiac<12){
            System.out.println("Çin Zodyağı Burcunuz :" + burc);
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız");
        }


        }
    }

