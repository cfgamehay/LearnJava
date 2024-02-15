import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        DanhSachSinhVien danhSach = new DanhSachSinhVien();
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                  + "2.	In danh sách sinh viên ra màn hình.\n"
                  + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                  + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                  + "5.	Làm rỗng danh sách sinh viên.\n"
                  + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                  + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                  + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                  + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                  + "0.   Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon)
            {
                case 1:
                {
                    System.out.print("Nhập mã sinh viên: ");
                    int maSinhVien = sc.nextInt();sc.nextLine();
                    System.out.print("Nhập họ và tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.print("Nhập điểm trung bình: ");
                    double diemTrungBinh = sc.nextDouble();
                    SinhVien newSv = new SinhVien(maSinhVien,hoTen,namSinh,diemTrungBinh);
                    danhSach.ThemSinhVien(newSv);
                    break;
                }
                case 2:
                {
                    danhSach.InDanhSach();
                    break;
                }
                case 3:
                {
                    System.out.println("Danh sách rỗng: "+danhSach.KiemTraRong());
                    break;
                }
                case 4:
                {
                    System.out.println("Số lượng sinh viên: "+danhSach.LaySoLuongSinhVien());
                    break;
                }
                case 5:
                {
                    danhSach.XoaDanhSach();
                    System.out.println("Đã xóa danh sách");
                    break;
                }
                case 6:
                {
                    System.out.print("Nhập mã sinh viên cần kiểm tra: ");
                    boolean ketqua = danhSach.KiemTraSinhVienCoTonTai(sc.nextInt());
                    System.out.println("Tồn tại: "+ketqua);
                    break;
                }
                case 7:
                {
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    danhSach.XoaSinhVien(sc.nextInt());
                    break;
                }
                case 8:
                {
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    danhSach.TimKiemSinhVien(sc.nextLine());
                    break;
                }
                case 9:
                {
                    danhSach.XuatDanhSachCoDiemGiamDan();
                    danhSach.InDanhSach();
                }
            }
            System.out.println("Nhập bất kì để tiếp tục");
            sc.nextLine();
        } while (luaChon != 0);
    }
}
