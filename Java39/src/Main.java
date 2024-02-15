public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra");
        ConNguoi cn = new ConNguoi("TITV" , 2021);
//		cn.An();
//		cn.Uong();
//		cn.Ngu();

        HocSinh hs = new HocSinh("TITV", 2021, "Lớp 1", "Trường 1");
        hs.An();
        hs.Uong();
        hs.Ngu();
        hs.LamBaiTap();
    }
}
