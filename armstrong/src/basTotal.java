import java.util.Scanner;
public class basTotal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number= input.nextInt();
        int result=0;

        while(number!=0){
            int basValue=number%10;
            result+=basValue;
            number/=10;

    }System.out.println(result);
}}
