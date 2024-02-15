import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //giai pt bac 2
        int a, b, c;
        double delta, x1, x2;
        Scanner sc = new Scanner(System.in);

        //tinh delta (b^2 - 4ac)
        //check delta
        /*
        d < 0 : vo nghiem
        d == 0 : nghiem kep (x1 = x2) = -b/2a
        d > 0 : 2ngiem
        x1: (-b-sqrt(delta))/(2a)
        x2: (-b+sqrt(delta))/(2a)
         */
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();

        delta = Math.pow(b, 2) - (4 * a * c);

        if (a != 0) {
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = (1.0) * (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep x1 = x2 : " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem x1 = " + x1 + ", " + "x2 = " + x2);

            }
        } else//sử dụng lại pt bac 1
        {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Pt vo so nghiem");
                } else {
                    System.out.println("Pt vo nghiem");
                }
            } else {
                x1 = 1.0 * -c / b;
                System.out.println("Phuong trinh co nghiem: " + x1);
            }
        }

    }
}
