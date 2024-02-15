public abstract class PhuongTienDiChuyen{
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;


    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }
    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }
    public void batDau()
    {
        System.out.println("Xe bat dau chay...");
    }
    public void tangToc()
    {
        System.out.println("Xe dagn tang toc...");
    }
    public void dungLai()
    {
        System.out.println("Xe dang dung...");
    }
    public abstract double layVanToc();




}
