public class ConstructorOOP {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("John", 30, 80.0);
        t1.show();
        t1.getResult();
    }

}

class Teacher {
    private String name;
    private int age;
    private double score;

    public Teacher(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void show() {
        System.out.println(name + " " + age + " " + score);
    }

    public double getResult() {
        return score;
    }
}