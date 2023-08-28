import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;

        while(right>0){
            System.out.print("Kullanıcı Adınız :");
            userName=input.nextLine();
            System.out.print("Şifreniz :");
            password= input.nextLine();
            if (userName.equals("Burak")&& password.equals("123456")){
                System.out.println("Sisteme Giriş Yaptınız");
                do{
                    System.out.println("1-Para yatırma\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select= input.nextInt();
                    if (select ==1){
                        System.out.print("Para miktarı : ");
                        int price= input.nextInt();
                        balance+=price;
                    } else if (select==2) {
                        System.out.print("Para Miktarı : ");
                        int price= input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiyenizdeki tutardan fazlasını çekemezsiniz");
                        }else{
                            balance-=price;

                        }

                    } else if (select==3) {
                        System.out.println("Bakiyeniz: "+balance);

                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }else{
                right--;
                if (right==0){
                    System.out.println("hesabınız Bloke Olmuştur");
                }else{
                    System.out.println("Hatalı Kullanıcı adı veya şifre girdiniz");
                    System.out.println("Kalan hakkınız "+right);
                }

            }
        }


    }
}