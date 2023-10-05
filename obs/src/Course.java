public class Course {

    Teacher teacher;//teacher sınıfından bir nesne almaya yarar
    String name;
    String code;
    String prefix;
    int note;
    int viva;
    float ses;


    Course(String name, String code, String prefix, float ses) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.ses=ses;
        int note = 0;
        int viva =0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) { //teacherin branşı course un prefixine eşit mi ?
            this.teacher = teacher;
            //printTeacher();
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor !");
        }

    }

    void printTeacher() {
        this.teacher.print(); //teacher sınıfınddaki print metodounu çalıştırır

    }


}
