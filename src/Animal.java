public class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void sleep() {
        System.out.println(name + " спить.");
    }

    public void move() {
        System.out.println(name + " рухається.");
    }

    public void makeSound() {
        System.out.println(name + " видає звук.");
    }
}