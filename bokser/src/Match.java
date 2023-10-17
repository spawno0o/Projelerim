import com.sun.source.tree.WhileLoopTree;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int round = 1;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight ){
        if (baslangic()){
            this.f1=f1;
            this.f2=f2;
        }else{
            this.f1=f2;
            this.f2=f1;
        }

        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }


    void run(){
        if(isCheck()){ //isCheck ten true değeri dönerse burası çalışmaya başlayacak
            while(this.f1.hp >0 && this.f2.hp>0 ){ //kaç kere değer döneceği belli olmadığı için while kullanılıyor
                System.out.println("****** ROUND " + round + " ******");
                this.f2.hp = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " nin canı = " + this.f2.hp);
                if(isWin()){ // iswin sorgusunu çalıştırıyoruz true değeri dönerse durduruyoruz
                    break;}
                this.f1.hp = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " nin canı = "+ this.f1.hp);
                if(isWin()) {//iswin sorgusunu çalıştırıyoruz true değeri dönerse durduruyoruz
                    break;}
                round++;
            }
        }else {//isCheckten false değeri dönerse burası çalışacak
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }

    boolean isCheck(){ //f1 ve f2 nin değerlerinin uygun olup olmadığını karşılaştırıp true yada false değer çıkmasını sağlıyoruz
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >=minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.hp == 0) {
            System.out.println(this.f2.name + " Kazandı !");
            return true;
        }
        if(this.f2.hp == 0) {
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }
        return false;
    }

    boolean baslangic(){
        double randomNumber = Math.random() * 100;
        return randomNumber <=50;

    }
}
