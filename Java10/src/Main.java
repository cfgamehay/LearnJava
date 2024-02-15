import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chuyen doi kieu du lieu

        int a = 100;
        int b = 2;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //ep kieu ngam dinh
        float c = a;
        float d = b;

        System.out.println("c = "+c);
        System.out.println("d = "+d);

        //ep kieu tuong minh (float thi phai them f vao sau so)
        float e = 3.5f;
        float f = 9.5f;

        System.out.println("e = "+e);
        System.out.println("f = "+f);

        int g = (int)e;
        int h = (int)f;

        System.out.println("g = "+g);
        System.out.println("h = "+h);

        //ep kieu tu doi tuong thanh kieu du lieu nguyen thuy

        int x = new Integer(32);
        System.out.println("x = "+x);
    }
}
