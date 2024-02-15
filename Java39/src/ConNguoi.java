public class ConNguoi {
    protected String hoTen;
    protected int namSinh;

    public ConNguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
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
    public void An()
    {
        System.out.println("nom nom");
    }
    public void Uong()
    {
        System.out.println("Uc uc");
    }
    public void Ngu()
    {
        System.out.println("ZZZzzzz...");
    }
}
