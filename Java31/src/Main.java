public class Main {
    public static void main(String[] args) {

        HoaDonCafe hd1 = new HoaDonCafe("Cafe Trung Nguyen",510000,1.5);
        HoaDonCafe hd2 = new HoaDonCafe("Cafe Trung Nguyen",100000,5);
        hd1.InHoaDon();
        System.out.println("Khoi luong lon hon 1 kg: "+hd1.KiemTraKhoiLuongLonHon(1));
        System.out.println("Tong tien lon hon 500k?: "+hd1.KiemTraTongTienLonHon500k());
        System.out.println("So tien phai tra: " + hd1.TinhTongTien());
        System.out.println("So tien dc giam: " + hd1.GiamGia(10));
        System.out.println("So tien phai tra sau khi giam gia: "+ hd1.GiaSauKhiGiam(10));
        System.out.println();
        hd2.InHoaDon();
        System.out.println("Khoi luong lon hon 1 kg: "+hd2.KiemTraKhoiLuongLonHon(1));
        System.out.println("Tong tien lon hon 500k?: "+hd2.KiemTraTongTienLonHon500k());
        System.out.println("So tien phai tra: " + hd2.TinhTongTien());
        System.out.println("So tien dc giam: " + hd2.GiamGia(10));
        System.out.println("So tien phai tra sau khi giam gia: "+ hd2.GiaSauKhiGiam(10));
    }
}
