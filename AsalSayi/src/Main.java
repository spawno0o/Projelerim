public class Main {
    public static void main(String[] args) {

/*        for (int i=2;i<=100;i++){
            System.out.println(i+" i");
            boolean asal=true;
            for(int j=2;j<i;j++){
                System.out.println(j + " j");
                if(i%j==0)
                    asal=false;
                System.out.println(asal+" asal");
            }
            if(asal==true)
                System.out.println("*"+i+"*");
        }*/

        for(int i=2;i<=100;i++){
            boolean asal=true;
            for(int k=2;k<i;k++){
                if(i%k==0)
                    asal=false;
            }if(asal==true){
                System.out.println(i +" i");
            }
        }
        }
}