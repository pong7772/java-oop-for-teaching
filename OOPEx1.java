public class OOPEx1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 100;
        s1.score = 90.0;
        s1.show();

        Student s2 = new Student();
        s2.age = 200;
        s2.score = 80.0;
        s2.show();

        Student s3 = new Student();
        s3.age = 300;
        s3.score = 70.0;
        s3.show();

    }
}

 class Student {
    String name ;
    int age ;
    double score ;
    
    public void show() {
        System.out.println("Name: " + name + " Age: " + age + " Score: " + score);
    }
}