import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz :");
        int counter= input.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sayi;
       
        for (int i=1;i<=counter;i++){
            System.out.print(i +".Sayıyı Giriniz : ");
            sayi= input.nextInt();
            if (sayi<min) min=sayi;
            else max=sayi;


            }
        System.out.println(" En Büyük Değer : " + max);
        System.out.println(" En Küçük Değer : " + min);
        }


    }
