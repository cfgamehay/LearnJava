public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void Bark()
    {
        System.out.println("Barking...");
    }

    @Override
    public void Eat() {
        System.out.println("The dog is eating...");
    }

    @Override
    public void MakeSound() {
        System.out.println("The dog is making noise...");
    }
}
