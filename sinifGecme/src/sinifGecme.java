import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fiz,tr,kim,muz,toplam=0,ders=0;
        double ort;

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat= input.nextInt();
        if(mat<0||mat>100){mat=0;}
        toplam+=mat;
        ders++;

        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz= input.nextInt();
        if(fiz<0||fiz>100){fiz=0;}
        toplam+=fiz;
        ders++;

        System.out.print("Türkçe Notunuzu Giriniz : ");
        tr= input.nextInt();
        if(tr<0||tr>100){tr=0;}
        toplam+=tr;
        ders++;

        System.out.print("Kimya Notunuzu Giriniz : ");
        kim= input.nextInt();
        if(kim<0||kim>100){kim=0;}
        toplam+=kim;
        ders++;

        System.out.print("Müzik Notunuzu Giriniz : ");
        muz= input.nextInt();
        if(muz<0||muz>100){muz=0;}
        toplam+=muz;
        ders++;

        ort=toplam/ders;


        if(ort>=55){
            System.out.println("Not Ortalamanız :" +ort+" \nDurumunuz : Geçti");
    }else{
            System.out.println("Not Ortalamanız :" +ort+" \nDurumunuz : Kaldı");}
}}
