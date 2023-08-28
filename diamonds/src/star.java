import java.sql.SQLOutput;
import java.util.Scanner;

public class star {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");
        int n= input.nextInt();

        for (int i =1;i<=n; i++){ // girilen basamak sayısı kadar aşağıya gidilmesini sağlar
            for(int k=1; k<= n-i;k++) { // basamak sayılarının yanında boşluk bırakılmasını sağlar
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){ //yıldız eklenmesini sağlar
                System.out.print("*");
            }
            System.out.println(); //bir alt satıra geçmesi için
        }
    }

}
