import java.util.Scanner;
public class Main {
    public static boolean asalMi(int sayi) { //girilen sayının 1 olup olmadığını kontrol ediyor
        if (sayi <= 1)
            return false;

        return asalMiHelper(sayi, sayi-1); // girilen sayıyı ve sayının bir eksiğini asalmıhelper metoduna gönderiyor
    }

    private static boolean asalMiHelper(int sayi, int bolen) { //sayının 1 eksiği bolen olarak adlanıyor
        if (bolen == 1)
            return true;

        if (sayi % bolen == 0)
            return false;

        return asalMiHelper(sayi, bolen-1); // girilen sayı aynı kalırken bolen sürekli bir eksiliyor
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi))
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");

    }

}