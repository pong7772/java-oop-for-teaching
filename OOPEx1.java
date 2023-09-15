public class OOPEx1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 100;
        s1.score = 90.0;
        s1.name = "sokai";
        s1.show();
        System.out.println(s1.getResult());

        Student s2 = new Student();
        s2.age = 200;
        s2.name = "sokai2";
        s2.score = 80.0;
        s2.show();
        System.out.println(s2.getResult());
        Student s3 = new Student();
        s3.name = "sokai3";
        s3.age = 300;
        s3.score = 70.0;
        s3.show();
        System.out.println(s3.getResult());
    }
}

 class Student {
    String name ;
    int age ;
    double score ;
    public String  getResult(){
        if (score > 100){
            return "A";
        }else if (score > 80){
            return "B";
        }else if (score > 60){
            return "C";
        }else if (score > 40){
            return "D";
        }else {
            return "F";
        }
    }
    public void show() {
        System.out.println("Name: " + name + " Age: " + age + " Score: " + score);
    }
    
}