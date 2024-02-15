import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhap so nguyen n: ");
        try{
            n = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Nhap du lieu sai");
        }finally {
            System.out.println("Finally!");
        }
        System.out.println("Gia tri da nhap: "+ n);
        System.out.println("Ket thuc");
    }
}
