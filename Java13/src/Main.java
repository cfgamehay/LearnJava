import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.print("Nhap a: ");
        a = sc.nextInt(); // gán
        System.out.println("a: "+ a);

        a+=3; //a = a+3;
        System.out.println("a+=3 :"+ a);

        a-=2; //a = a-2;
        System.out.println("a-=2 :"+ a);

        a*=3; //a = a*3;
        System.out.println("a*=3 :"+ a);

        a/=2; //a = a/2;
        System.out.println("a/=2 :"+ a);

        a%=2; //a = a%2;
        System.out.println("a%=2 :"+ a);


    }
}
