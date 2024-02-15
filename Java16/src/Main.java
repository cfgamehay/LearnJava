import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        String kq = (a%2==0) ? "Số chẵn" : "Số lẻ";
        System.out.println(a + " là " +kq);
    }
}
