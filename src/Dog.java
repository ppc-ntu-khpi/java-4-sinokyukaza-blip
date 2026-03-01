public class Dog extends Animal {

    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, double weight, String breed, boolean isTrained) {
        super(name, age, weight);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public void bark() {
        System.out.println(name + " гавкає: Гав-гав!");
    }

    public void fetch() {
        System.out.println(name + " приносить палку.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гавкає.");
    }
}