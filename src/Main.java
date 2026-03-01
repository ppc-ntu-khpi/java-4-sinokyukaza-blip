public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Рекс", 3, 12.5, "Вівчарка", true);

        dog.eat();
        dog.sleep();
        dog.move();
        dog.makeSound();
        dog.bark();
        dog.fetch();
    }
}