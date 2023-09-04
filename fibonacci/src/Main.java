import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Değer Giriniz : ");
        int a = input.nextInt();
        int n1=0,n2=1,total;

        for(int i =1;i<=a;i++){
            total=n1+n2;
            /*System.out.println("n1 ="+n1);
            System.out.println("n2 ="+n2);*/
            System.out.println(n1+"+"+n2+"="+total);
            n1=n2;
           /* System.out.println("n1 ="+n1);*/
            n2=total;
           /* System.out.println("n2 ="+n2);
            System.out.println("total ="+total);*/
            }
    }
}