package main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhập vào ý nghĩa: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 3) {
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = sc.nextLine();
                if (luaChon == 2) {
                    tuDien.xoaTu(tuKhoa);
                } else {
                    System.out.println("Ý nghĩa là: " + tuDien.traTu(tuKhoa));
                }
            } else if (luaChon == 4) {
                tuDien.InTuKhoa();
            } else if (luaChon == 5) {
                System.out.println("Số lượng từ khóa là: " + tuDien.LaySoLuong());
            } else if (luaChon == 6) {
                tuDien.xoaHetTu();
            }
        } while (luaChon != 0);
    }
}

