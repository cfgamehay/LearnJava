package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class TaiXiu {
    //4-10 xiu 11-17 tai else lose
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi","VN");
        NumberFormat numf = NumberFormat.getInstance(lc);
        double soDu = 5000;
        int luaChon = 1;
        do {
            System.out.println("Game tài xỉu đê!!! Hãy lựa chọn.");
            System.out.println("1. Chơi ngay nào");
            System.out.println("2. Hết tiền? Nạp thêm thôi");
            System.out.println("Nhập bất kì để thoát");
            System.out.print("Lựa chọn: ");
            luaChon = sc.nextInt();

            if (luaChon == 1 && soDu > 0) {
                //Dat cuoc
                System.out.println("Bạn có: " + numf.format(soDu) + "VND");
                System.out.print("Tiền đâu? nhập tiền nào!: ");
                double tienCuoc = sc.nextInt();
                while (tienCuoc <= 0 || tienCuoc > soDu) {
                    System.out.print("Nào có chơi không? Nhập tiền cho đúng nhe: ");
                    tienCuoc = sc.nextInt();
                }
                //Chon tai hay xiu
                System.out.print("Mún tài (1) hay mún xỉu (2)? Nhập số tương ứng");
                int luaChonTaiXiu = sc.nextInt();
                while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2) {
                    System.out.println("Rồi tài hay xỉu? Nhập lại!: ");
                    luaChonTaiXiu = sc.nextInt();
                }
                //Lac xuc sac
                Random xucSac = new Random();
                int giatri1 = xucSac.nextInt(5) + 1;
                int giatri2 = xucSac.nextInt(5) + 1;
                int giatri3 = xucSac.nextInt(5) + 1;
                //ket qua
                int tong = (giatri1 + giatri2 + giatri3);
                System.out.println("Xúc sắc 1: " + giatri1);
                System.out.println("Xúc sắc 2: " + giatri2);
                System.out.println("Xúc sắc 3: " + giatri3);
                System.out.println("Tổng: " + tong);
                if (tong == 3 || tong == 18) {
                    System.out.println("Nhà cái thắng bà nó gòi :). Gất tiếc bạn mất " + tienCuoc + "VND");
                    soDu -= tienCuoc;
                } else if (tong > 3 && tong < 11) {
                    System.out.println("Ra xỉu.....");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("Hên ghê! tiền về tiền về! Tiếp?");
                        System.out.println("+" + numf.format(tienCuoc) + "VND");
                        soDu += tienCuoc;
                    } else {
                        System.out.println("Xuiiiii :((! gỡ lại nào!?");
                        System.out.println("-" + numf.format(tienCuoc) + "VND");
                        soDu -= tienCuoc;
                    }
                } else {
                    System.out.println("Ra tài.....");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("Hên ghê! tiền về tiền về!");
                        System.out.println("+" + (numf.format(tienCuoc)) + "VND");
                        soDu += tienCuoc;
                    } else {
                        System.out.println("Xuiiiii :((!");
                        System.out.println("-" + (numf.format(tienCuoc)) + "VND");
                        soDu -= tienCuoc;
                    }

                }
            } else if (luaChon == 1 && soDu <= 0) {
                System.out.println("Bạn cần thêm xiền để chơi.");
            }
            if (luaChon == 2) {
                double tienNap = 0;
                System.out.print("Bạn muốn nạp bao nhiêu tiền?: ");
                tienNap = sc.nextDouble();
                System.out.println("+" + numf.format(tienNap) + "VND chơi game vui vẻ :)!");
                soDu += tienNap;
            }
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println();
        } while (luaChon == 1 || luaChon == 2);

    }
}
