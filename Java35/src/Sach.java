public class Sach {
    private String tenSach;
    private double giaSach;
    private int namSanXuat;
    private TacGia tacGia;

    public Sach(String tenSach, double giaSach, int namSanXuat, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.namSanXuat = namSanXuat;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void InTenSach()
    {
        System.out.println("Ten sách: "+ this.tenSach);
    }

    public boolean KiemTraHaiSachCoTrungNamXuatBan(Sach sachKhac)
    {
        return(this.getNamSanXuat() == sachKhac.getNamSanXuat());
    }

    public double TinhTienSachSauKhiGiamGia(double x)
    {
        return this.giaSach - this.giaSach*x/100;
    }




}
