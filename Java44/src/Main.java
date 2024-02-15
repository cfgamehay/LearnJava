public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Toyota", "JP");
        HangSanXuat h2 = new HangSanXuat("VinFast", "VN");
        HangSanXuat h3 = new HangSanXuat("Tesla", "US");

        MayBay mb = new MayBay("May bay",h1,"Dau hidroGen");
        XeOto oto = new XeOto("Oto", h2,"Sac dien");
        XeDap xeDap = new XeDap("Xe dap", h3);

        System.out.println("May bay:");
        System.out.println(mb.getHangSanXuat().getTenHangSanXuat());
        System.out.println("Nhien lieu: "+mb.getLoaiNhienLieu());
        mb.batDau();
        mb.tangToc();
        mb.dungLai();
        mb.catCanh();
        mb.haCanh();
        System.out.println("Van toc may bay: "+mb.layVanToc());

        System.out.println("Oto:");
        System.out.println(oto.getHangSanXuat().getTenHangSanXuat());
        System.out.println("Nhien lieu: "+oto.getLoaiNhienLieu());
        oto.batDau();
        oto.tangToc();
        oto.dungLai();
        System.out.println("Van toc oto: "+oto.layVanToc());

        System.out.println("Xe dap:");
        System.out.println(xeDap.getHangSanXuat().getTenHangSanXuat());
        xeDap.batDau();
        xeDap.tangToc();
        xeDap.dungLai();
        System.out.println("Van toc xe dap: "+oto.layVanToc());


    }
}
