public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private Date ngaySinh;
    private double diemTB;
    private Lop lop;

    public SinhVien(int maSinhVien, String hoTen, Date ngaySinh, double diemTB, Lop lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String getTenKhoa() {
        return this.lop.getTenKhoa();
    }

    public boolean KiemTraCoDauHayKhong() {
        return this.diemTB >= 5;
    }

    public boolean KiemTraSinhVienCoTrungNgaySinhVoiSinhVienKhac(SinhVien sinhVienKhac)
    {
        return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
    }
}
