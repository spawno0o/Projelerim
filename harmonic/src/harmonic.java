import java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        int n= input.nextInt();
        double result=0;

        for(int i=1;i<=n;i++){
            result +=(1.0/i); // 1.0 yazılmasının sebebi int değer int değere bölündüğünde double değer vermez ondan double değer yazılıyor

        }
        System.out.println(result);
    }
}
