import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz : ");
        int n1= input.nextInt();
        System.out.print("2.Sayıyı Giriniz : ");
        int n2= input.nextInt();
        int ebob=1;
        int ekok=1;

        if (n1<n2){

        for (int i =1;i<=n1;i++){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
        }

        }
        else
        {for (int i =1;i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                ebob=i;

        }}}


        System.out.println("Ebob :" +ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("Ekok :" +ekok);


}}