import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo đối tượng để nhập
        Scanner sc = new Scanner(System.in);

        String hoTen;
        long maSinhVien;
        float diemThi;

        System.out.print("Nhap ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLong();
        System.out.print("Nhap diem thi: ");
        diemThi = sc.nextFloat();

        System.out.println();
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Diem thi: " + diemThi);
    }
}
