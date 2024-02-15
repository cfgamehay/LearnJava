import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* phep toan so sanh
        == bẳng
        != khác
        > lớn hơn
        < bé hơn
        >= lớn hơn hoặc bằng
        <= nhỏ hơn hoặc bằng
         */
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        //xuat

        System.out.println(a+" = " + b + " : "+ (a==b));
        System.out.println(a+" != " + b + " : "+ (a!=b));
        System.out.println(a+" > " + b + " : "+ (a>b));
        System.out.println(a+" < " + b + " : "+ (a<b));
        System.out.println(a+" >= " + b + " : "+ (a>=b));
        System.out.println(a+" <= " + b + " : "+ (a<=b));
        System.out.println("-----------------------");
        System.out.println("Cả 2 là chẵn : " + (a%2==0 && b%2 ==0));
        System.out.println("Có ít nhất 1 số chẳn: " + (a%2==0 || b%2 ==0));

    }
}
