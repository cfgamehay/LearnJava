import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pt bac nhat
        int a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vo so nghiem");
            } else {
                System.out.println("Pt vo nghiem");
            }
        } else {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem: " + x);
        }
    }
}
