import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //phép toán cơ bản

        //khai bao
        int a,b;
        //nhap
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao a: ");
        a = sc.nextInt();
        System.out.println("Nhap vao b: ");
        b = sc.nextInt();

        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        //float thuong = (float)a / b
        float thuong = 1.0f * a / b;
        int soDu = a%b;

        System.out.println(a+" + "+b+" = "+tong);
        System.out.println(a+" - "+b+" = "+hieu);
        System.out.println(a+" * "+b+" = "+tich);
        System.out.println(a+" / "+b+" = "+thuong);
        System.out.println(a+" % "+b+" = "+soDu);

    }
}
