import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number){
        int temp = number,lastNumber,reverseNumber=0;
        while(temp!=0){
            System.out.println(" temp : "+temp);
            lastNumber=temp%10;
            System.out.println("lastnumber : "+lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp=temp/10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.print("Değer Giriniz : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(isPalindrom(a));
        //System.out.println(isPalindrom(898));




    }
}