public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Burak", "TRH", "555"); // Teacher sınıfından t1 adından yeni bir öğretmen oluşturuldu.
        Teacher t2 = new Teacher("Graham", "FZK", "0000");
        Teacher t3 = new Teacher("Kül yutmaz", "BIO", "1111");
        Course tarih = new Course("Tarih", "101", "TRH",0.2F);
        Course fizik = new Course("Fizik", "102", "FZK",0.5F);
        Course biyo = new Course("Biyoloji", "101", "BIO",0.6F);

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4.Sınıf", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 78, 50,100,100,100);
        s1.isPass();
        /*Student s2 = new Student("Necmi","444", "4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,100,100,100);

        s1.aldigiDers(); */


        System.out.println(tarih.ses);
        System.out.println(tarih.prefix);



    }
}