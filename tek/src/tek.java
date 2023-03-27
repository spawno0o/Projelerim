import java.util.Scanner;
public class tek {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
/*        int x=0,topla=0;
        do{
            System.out.print("Bir Sayı Giriniz : ");
            x= input.nextInt();
            if(x%2==1){
                topla+=x; //x değerini toplanın üzerine atar sürekli
            }
        }while(x>0); //x sıfırdan büyük olduğu sürece do nun içindeki komutlar çalışır.
        System.out.print("Tek Sayıların Toplamı : "+topla);
*/

        int x,total=0;
        do{
            System.out.print("Sayı Giriniz : ");
            x= input.nextInt();
            if(x%4==0){
                total+=x;
            }
        }while(x%2==0); // x çift sayı olduğu sürece do döngüsü devam eder
        System.out.println("Sayıların Toplamı : "+total);


    }
}
