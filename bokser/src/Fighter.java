public class Fighter {
    String name;
    int damage;
    int hp;
    int weight;
    int dodge;


    Fighter(String name, int damage, int hp, int weight, int dodge){
        this.name =name;
        this.damage = damage;
        this.hp=hp;
        this.weight=weight;
        if (dodge >=0 && dodge<=100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe){
        System.out.println(this.name + " " + this.damage + " " + foe.name );
        if (foe.isDodge()){
            System.out.println(foe.name + " Gelen Hasarı Blokladı !!!" );
            return foe.hp;
        }
        System.out.println(this.name + "=>"+ foe.name + " " + this.damage + " hasar vurdu");
        if (foe.hp - this.damage < 0){
            return foe.hp = 0;
        }
        return foe.hp - this.damage;

    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
