import java.util.Scanner;

public class Main {

    static void bulma (int a, int b){
        if (a>0){ // a değeri 0 dan büyükse
            System.out.print(a+" ");
            bulma(a-5,b); // a değerinden 5 çıkartarak bulma metodunu tekrar çalıştırıyoruz
        } else if (a <=0) { // a 0 a eşit veya 0 dan küçük olursa eksi metoduna geçiyoruz
            eksi(a,b);
        }
    }
    static void eksi (int a, int b){
        if(b>=a){ // b değeri a dan büyükse ( b değeri kullanıcının girdiği ilk değerdi, kullanıcının girdiği değeri yani n yi c ile eşitlemiştik)
            System.out.print(a+" ");
            eksi(a+5,b); // a ya 5 ekliyip tekrar eksi metodunu çalıştırıyoruz
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Değer Giriniz : ");
        int n = input.nextInt();
        int c =n;
        bulma(n,c);

    }
}