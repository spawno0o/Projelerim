public class Main {
    static int fib(int n){
        System.out.println("n 1.satır : "+n);
        if(n==1 || n==2){
            System.out.println("n 2.satır: "+n);
            return 1;
        }
        System.out.println("n 3.satır :"+n);
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fib(5));
            }
}