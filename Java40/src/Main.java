public class Main {
    public static void main(String[] args) {
//        System.out.println("Dog:");
//        Dog dog = new Dog("Tuan");
//        System.out.println(dog.getName());
//        dog.Eat();
//        dog.Bark();
//
//        System.out.println("Pupppy:");
//        Puppy puppy = new Puppy("kiki");
//        System.out.println(puppy.getName());
//        puppy.Bark();
//        puppy.weep();
//        puppy.Eat();

        Dog dog = new Dog("DOGG");
        Cat cat = new Cat("CATT");
        Bird bird = new Bird("BIRDD");

        dog.Bark();
        dog.Eat();

        cat.Meow();
        cat.Eat();

        bird.Fly();
        bird.Eat();
    }
}
