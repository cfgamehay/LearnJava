package main;

import java.util.*;

public class RutThanTrungThuong_HashSet {
    Set<String> hopPhieuDuThuong = new HashSet<String>();

    public RutThanTrungThuong_HashSet() {

    }

    public boolean ThemPhieu(String s) {
        return this.hopPhieuDuThuong.add(s);
    }

    public boolean XoaPhieu(String s) {
        return this.hopPhieuDuThuong.remove(s);
    }

    public boolean KiemTraPhieuTonTai(String s)
    {
        return this.hopPhieuDuThuong.contains(s);
    }
    public void XoaHetPhieu()
    {
        this.hopPhieuDuThuong.clear();
    }
    public int LaySoLuongPhieu()
    {
        return this.hopPhieuDuThuong.size();
    }
    public String RutTham()
    {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.hopPhieuDuThuong.size());
        ketQua = (String) this.hopPhieuDuThuong.toArray()[viTri];
        this.hopPhieuDuThuong.remove(ketQua);
        return ketQua;
    }
    public void XuatHetPhieu()
    {
        System.out.println(Arrays.toString(hopPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        RutThanTrungThuong_HashSet rt = new RutThanTrungThuong_HashSet();
        Scanner sc = new Scanner(System.in);
        String maDuThuong = "";
        int luaChon = 0;
        do {
            System.out.println("1. Thêm phiếu thưởng");
            System.out.println("2. Xóa phiếu dự thưởng");
            System.out.println("3. Kiểm tra phiếu có tồn tại");
            System.out.println("4. Xóa bỏ hết phiếu");
            System.out.println("5. Số lượng phiếu hiện có");
            System.out.println("6. Rút thăm trúng thưởng");
            System.out.println("7. Xuất ra tất cả các phiếu");
            System.out.println("0. Thoát");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon==1 || luaChon==2 || luaChon==3)
            {
                System.out.print("Nhập mã phiếu: ");
                maDuThuong = sc.nextLine();
            }

            switch (luaChon)
            {
                case 1:
                {
                    System.out.println("Thêm phiếu: "+rt.ThemPhieu(maDuThuong));
                    break;
                }
                case 2:
                {
                    System.out.println("Xóa phiếu: "+rt.XoaPhieu(maDuThuong));
                    break;
                }
                case 3:
                {
                    System.out.println("Phiếu "+maDuThuong+" có tồn tại: "+rt.KiemTraPhieuTonTai(maDuThuong));
                    break;
                }
                case 4:
                {
                    rt.XoaHetPhieu();
                    System.out.println("Đã loại bỏ hết phiếu.");
                    break;
                }
                case 5:
                {
                    System.out.println("Số lượng phiếu có trong thùng: "+rt.LaySoLuongPhieu());
                    break;
                }
                case 6:
                {
                    System.out.println("Phiếu thăm đã rút: "+rt.RutTham());
                    break;
                }
                case 7:
                {
                    System.out.println("Các mã phiếu là: ");
                    rt.XuatHetPhieu();
                    break;
                }
            }
        } while (luaChon != 0);
    }

}
