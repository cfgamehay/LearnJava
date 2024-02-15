public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private NhaSanXuat nhaSanXuat;
    private double giaVe;
    private Date ngayChieu;

    public Phim(String tenPhim, int namSanXuat, NhaSanXuat nhaSanXuat, double giaVe, Date ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.nhaSanXuat = nhaSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean KiemTraPhimCoReHonPhimKhac(Phim phimKhac)
    {
        return this.giaVe < phimKhac.getGiaVe();
    }
    public String InNhaSanXuat()
    {
        return this.nhaSanXuat.getTenHang();
    }
    public double TongTienPhaiTraSauKhiGianGia(double n)
    {
        return this.giaVe - ((this.giaVe*n)/100);
    }
}
