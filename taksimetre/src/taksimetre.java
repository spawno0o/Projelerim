import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double acilis=10,perKM=2.20,mesafe,tutar;
        Scanner input=new Scanner (System.in);
        System.out.print("Gidilecek mesafeyi girin :");
        mesafe= input.nextDouble();
        tutar=(mesafe*perKM)+acilis;
        tutar=(tutar<20) ? 20:tutar; //tutar 20 den düşükse 20 değilse tutar yazar
        System.out.println("Toplam Tutar: "+tutar);
    }
}
