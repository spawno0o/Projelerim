import java.util.Scanner;

public class iki {
    public static void main(String[] args) {
        /*int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n= input.nextInt();

        for(int i=1;i<=n;i*=2){
            System.out.println(i);
        }*/

        /*Scanner input=new Scanner(System.in);
        int n,i=1;

        System.out.print("Sınır değeri Giriniz : ");
        n=input.nextInt();

        while(i<=n){
            System.out.println(i);
            i*=2;
        }
*/
        int n,i,k,sayac=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır Değer : ");
        n= input.nextInt();

        for(i=1,k=1; i<=n && k<=n;i*=4,k*=5){
            System.out.println(n+" sayısına kadar 4 ün "+sayac+". kuvveti = "+i+" ve 5 in "+sayac+". kuvveti = "+ k);
            sayac++;
        }
    }
}
