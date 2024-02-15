public class HoaDonCafe {
    //OOP 2
    private String tenCafe;
    private double giaTien;
    private double khoiLuong;

    public HoaDonCafe(String tenCafe, double giaTien, double khoiLuong)
    {
        this.tenCafe = tenCafe;
        this.giaTien = giaTien;
        this.khoiLuong = khoiLuong;
    }

    public double TinhTongTien()
    {
        double tongTien = giaTien * khoiLuong;
        return tongTien;
    }
    public boolean KiemTraKhoiLuongLonHon(double khoiLuong)
    {
        return this.khoiLuong > khoiLuong;
    }
    public boolean KiemTraTongTienLonHon500k(){
        return TinhTongTien() > 500000;
    }
    public double GiamGia(double x)
    {
        if(TinhTongTien() > 500000)
        {
            return (x/100)*TinhTongTien();
        }
        return 0;
    }
    public double GiaSauKhiGiam(double x)
    {
        return TinhTongTien() - GiamGia(x);
    }
    public void InHoaDon()
    {
        System.out.println("Tên cafe: "+tenCafe);
        System.out.println("Khối lượng đã mua: "+ khoiLuong);
        System.out.println("Số tiền trên 1 kg: "+giaTien);
    }
}
