public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int viva1 , int viva2, int viva3) { // note1,note2,note3 kullanıcıdan (dışarıdan) girilecek not değerleridir
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1; //course sınıfındaki note niteliğine erişeceğiz
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2; //course sınıfındaki note niteliğine erişeceğiz
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3; //course sınıfındaki note niteliğine erişeceğiz
        }
        if (viva1 >= 0 && viva1 <= 100) {
            this.c1.viva = viva1;
        }
        if (viva2 >= 0 && viva2 <= 100) {
            this.c2.viva = viva2;
        }
        if (viva3 >= 0 && viva3 <= 100) {
            this.c3.viva = viva3;
        }
    }

    void isPass() {
        /*this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz");
            this.isPass = true;
        }

        else{
            System.out.println("Sınıfta Kaldınız");
            this.isPass = false;//
        }
        printNote();*/
        System.out.println(this.c1.note);
        System.out.println(this.c1.ses);
        System.out.println(this.c1.note * c1.ses +"******");
        System.out.println(this.c1.viva * (1-c1.ses)+ "////////");

        this.avarage =  (
                (this.c1.note * c1.ses)
                +(this.c2.note * c2.ses)
                +(this.c3.note * c3.ses)
                        +(this.c1.viva*(1-c1.ses))
                        +(this.c2.viva*(1-c2.ses))
                +(this.c2.viva*(1-c3.ses))) /3.0 ;
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz");
            this.isPass = true;
        }

        else{
            System.out.println("Sınıfta Kaldınız");
            this.isPass = false;//
        }
        printNote();


    }

    void printNote() {
        System.out.println(this.c1.name + " Notu:" + this.c1.note);
        System.out.println(this.c2.name + " Notu:" + this.c2.note);
        System.out.println(this.c3.name + " Notu:" + this.c3.note);
        System.out.println("Ortalamanız : " + this.avarage);
    }

    void aldigiDers(){
        System.out.println(this.c1.name + " " + this.c2.name + " " + this.c3.name);
    }


}
