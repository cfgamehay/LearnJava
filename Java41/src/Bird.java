public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void Fly()
    {
        System.out.println("Flying...");
    }

    @Override
    public void Eat() {
        System.out.println("The bird is eating...");
    }

    @Override
    public void MakeSound() {
        System.out.println("The bird is singing");
    }
}
