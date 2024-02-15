public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void Meow()
    {
        System.out.println("Meoooow...");
    }

    @Override
    public void Eat() {
        System.out.println("The cat is eating...");
    }

    @Override
    public void MakeSound() {
        System.out.println("The cat is making noise...");
    }
}
