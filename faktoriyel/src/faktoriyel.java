import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       /* System.out.println("Faktoriyel Değerini Giriniz : ");
        int f=input.nextInt(); */
        /* int total=1;
        for(int i=1;i<=f;i++){
            total=total*i;

        }System.out.println(total); */

        /* int i=1,total=1;
        while(i<=f){
            total=total*i;
            i++;
        }
        System.out.println(total); */

        int i,n,r,a,totalN=1,totalR=1,totalA=1;
        System.out.println("N değerini giriniz : ");
        n= input.nextInt();
        System.out.println("R değerini giriniz : ");
        r=input.nextInt();

        for(i=1;i<=n;i++){
            totalN=totalN*i;
        }
        for(i=1;i<=r;i++){
            totalR=totalR*i;
        }a=n-r;
        for(i=1;i<=a;i++){
            totalA=totalA*i;
        }
        System.out.println(totalN/(totalR*totalA));
    }
}
