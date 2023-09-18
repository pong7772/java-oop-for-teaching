public class InheritanceOOP {

    public static void main(String[] args) {

    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }

    public void run() {
        System.out.println("Animal run");
    }

    public void walk() {
        System.out.println("Animal walk");
    }

    public void jump() {
        System.out.println("Animal jump");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat");
    }

    public void sleep() {
        System.out.println("Dog sleep");
    }

    public void die() {
        System.out.println("Dog die");
    }

}