public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(2,9,2012);
        Date d2 = new Date(4,1,2014);
        Date d3 = new Date(23,1,2019);
        TacGia tg1 = new TacGia("Binh", d1);
        TacGia tg2 = new TacGia("Nhan", d2);
        TacGia tg3 = new TacGia("Thang", d3);
        Sach s1 = new Sach("Vi cau la ban nho cua to",10000,2022,tg1);
        Sach s2 = new Sach("Minh la nguoi tot",14000,2019,tg2);
        Sach s3 = new Sach("Khong vi ban than",12300,2022,tg3);

        s1.InTenSach();

        System.out.println("kiem tra ngay xuat ban cua sach 1 va sach 3 co trung hay khong:"+s1.KiemTraHaiSachCoTrungNamXuatBan(s3));
        System.out.println("kiem tra ngay xuat ban cua sach 1 va sach 2 co trung hay khong:"+s1.KiemTraHaiSachCoTrungNamXuatBan(s2));

        System.out.println("Gia sau sach "+ s1.getTenSach() +": Sau kho giam 10%: " +s1.TinhTienSachSauKhiGiamGia(10));
        System.out.println("Gia sau sach "+ s2.getTenSach() +": Sau kho giam 30%: " +s2.TinhTienSachSauKhiGiamGia(30));
        System.out.println("Gia sau sach "+ s3.getTenSach() +": Sau kho giam 50%: " +s3.TinhTienSachSauKhiGiamGia(50));
    }
}
