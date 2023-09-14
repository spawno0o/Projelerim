import java.util.Scanner;

public class Main {
    static int power(int a, int b){
                if (b==0){
            return 1;
        }

        int result =a*power(a,b-1);
                return result;
            }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz : ");
        int taban = input.nextInt();
        System.out.print("Üs Değeri Giriniz : ");
        int us = input.nextInt();

        System.out.println("Sonuç : "+ power(taban,us));

    }
}