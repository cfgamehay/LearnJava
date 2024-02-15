public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("DOGG");
        Cat cat = new Cat("CATT");
        Bird bird = new Bird("BIRDD");

        dog.Bark();
        dog.Eat();
        dog.MakeSound();

        cat.Meow();
        cat.Eat();
        cat.MakeSound();

        bird.Fly();
        bird.Eat();
        bird.MakeSound();
    }
}
