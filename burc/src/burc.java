import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        int month,day,kosul=0;
        String burc = null;
                Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz Günü Giriniz : ");
        day= input.nextInt();

        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month=input.nextInt();

        if(month==1&&day>=0&&day<=31){
            if(day<=21){
                burc="Oğlak";
                kosul++;
            }else{
                burc="Kova";
                kosul++;
            }
        }else if(month==2&&day>=0&&day<=31){
            if(day<=19){
                 burc="Kova";
                 kosul++;
            }else{
                burc="Balık";
                kosul++;
            }
        }else {
            System.out.println("Hatalı Giriş Yaptınız, Tekrar Deneyiniz");

        }
        if(kosul==1){
            System.out.print("Burcunuz : "+burc);
        }
    }
}
