public class SinhVien implements Comparable<SinhVien>{
    private int maSinhVien;
    private String hoTen;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
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

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return
                "Mã sinh viên: " + maSinhVien +
                ", Họ và tên: '" + hoTen + '\'' +
                ", Năm sinh: " + namSinh +
                ", Điểm trung bình: " + diemTrungBinh;
    }

    @Override
    public int compareTo(SinhVien o) {
        double diemThis = this.getDiemTrungBinh();
        double diemO = o.getDiemTrungBinh();

        if ((diemThis-diemO)>0) {
            return 1;
        }else if((diemThis-diemO)==0)
        {
            return 0;
        }else {
            return -1;
        }
    }
}
