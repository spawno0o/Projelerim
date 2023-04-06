public class Three {
    public static void main(String[] args) {
        int total1=1,total2=1,total3=1;
        for(int number=100;number<=999;number++){
            int temp=number;

            int bas1=temp%10;
            for(int i=1;i<=3;i++){
                total1*=bas1;
                System.out.println(total1);
            }
            temp=temp/10;

            int bas2=temp%10;
            for(int a=1;a<=3;a++){
                total2*=bas2;
            }
            temp=temp/10;

            int bas3=temp%10;
            for(int b=1;b<=3;b++){
                total3*=bas3;
            }

            int result=total1+total2+total3;
            if(number==result){
                System.out.println(number + " armstrong");
            }

        }
    }
}
