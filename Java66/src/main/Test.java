package main;

public class Test {
    public static void main(String[] args) {
        Box<Integer> b = new Box<Integer>(12);
        Box<String> b2 = new Box<String>("Chổi");
        System.out.println(b.getValue());
        System.out.println(b2.getValue());
    }
}
