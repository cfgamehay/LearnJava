import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //static class khon can khoi tao van dung dc phuong thuc
        Scanner sc = new Scanner(System.in);
        double a,b;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        System.out.println("a: "+a+ ", b: "+b);
        System.out.println();
        //tính trị tuyet doi
        System.out.println("|" + a + "| : " + Math.abs(a));
        //tim min
        System.out.println("min(a,b):" + Math.min(a,b));
        //tim max
        System.out.println("max(a,b):" + Math.max(a,b));
        //ceil
        System.out.println("ceil(a):" + Math.ceil(a));
        //floor
        System.out.println("floor(a):" + Math.floor(a));
        //sqrt
        System.out.println("sqrt(a):" + Math.sqrt(a));
        //pow
        System.out.println("pow(a,b):" + Math.pow(a,b));
    }
}
