public class Main {
    public static void main(String[] args) {
        NhaSanXuat nsx1 = new NhaSanXuat("Phuong Nam","VN");
        NhaSanXuat nsx2 = new NhaSanXuat("Mavel","US");
        Date d1 = new Date(10,2,2024);
        Date d2 = new Date(14,1,2024);
        Phim p1 = new Phim("Toi qua ben day",2022,nsx1,100000,d1);
        Phim p2 = new Phim("Toi qua ben do",2021,nsx2,134000,d2);

        System.out.println(p1.getTenPhim());
        System.out.println(p1.KiemTraPhimCoReHonPhimKhac(p2));
        System.out.println(p1.InNhaSanXuat());
        System.out.println(p1.TongTienPhaiTraSauKhiGianGia(10));
    }
}
