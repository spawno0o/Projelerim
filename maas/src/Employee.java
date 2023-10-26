public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee (String name,double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this. workHours = workHours;
        this. hireYear = hireYear;
    }
    double tax(){
        if(this.salary <=1000.0){
            return 0;
        }
        else {
            return salary * 0.03;
        }

    }

    double bonus(){
        if(this.workHours >= 40){
            return (this.workHours - 40)*30;
        }
        return 0;
    }

    double raiseSalary(){
        if(2021 - hireYear < 10){
            return this.salary*0.05;
        }else if( 2021 - hireYear <20){
            return this.salary*0.1;
        }else{
            return this.salary*0.15;
        }
    }

    double hamMaas (){
        return this.salary + bonus() - tax();
    }
    void bas(){
        System.out.println("Çalışanın Adı : " + this.name + "\n" +
        "Çalışanın Maaşı : " + this.salary + "\n"+
        "Çalışanın Başlangıç Yılı : " + this.hireYear + "\n"+
        "Vergi : " + tax() +"\n"+
        "Bonus : " +bonus()+"\n"+
        "Maaş Artışı : "+raiseSalary() + "\n"+
        "Vergi ve Bonuslar ile Birlikte Maaşı : " + hamMaas()+"\n"+
        "Toplam Maaş : " + (hamMaas() + raiseSalary()));
    }




}
