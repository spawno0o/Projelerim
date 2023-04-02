import java.util.Scanner;
public class uslu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı : ");
        int n= input.nextInt();
        System.out.print("Üs : ");
        int k=input.nextInt();

        int i,total=1;
        /*while(i<=k){
            total*=n;
            i++;
        }
        System.out.println(total);*/
        for(i=1;i<=k;i++){
            total*=n;
        }
        System.out.println(total);

    }
}
