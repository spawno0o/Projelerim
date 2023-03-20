import java.util.Scanner;
public class ticket2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yas,mesafe,tip;
        double nTutar;

        System.out.print("Yasinizi Giriniz : ");
        yas= input.nextInt();

        System.out.print("Mesafeyi Giriniz : ");
        mesafe= input.nextInt();

        System.out.println("Bilet Tipini Seçiniz \n 1-Tek Yön \n 2-Gidiş Dönüş");
        tip= input.nextInt();

        nTutar=mesafe*0.1;

        if(yas<0||yas>100||tip<0||tip>2||mesafe<0){
            System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyiniz");
        }else{
            switch(tip){
                case 1:
                    if(yas<12){
                        System.out.println("Bilet Tutarınız : "+(nTutar/2));
                    }else if(yas<24){
                        System.out.println("Bilet Tutarınız : "+(nTutar*0.9));
                    }else if(yas>65){
                        System.out.println("Bilet Tutarınız : "+(nTutar*0.7));
                    }else{
                        System.out.println("Bilet Tutarınız : "+nTutar);
                    }
                        break;
                case 2:
                    if(yas<12){
                        System.out.println("Bilet Tutarınız :"+2*(nTutar-((nTutar/2)*0.2)));
                    }else if(yas<24){
                        System.out.println("Bilet Tutarınız :"+2*(nTutar-((nTutar*0.9)*0.2)));
                    }else if (yas>65){
                        System.out.println("Bilet Tutarınız :"+2*(nTutar-((nTutar*0.7)*0.2)));
                    }else{
                        System.out.println("Bilet Tutarınız :"+2*nTutar);
                    }
                    break;
            }
        }
    }
}
