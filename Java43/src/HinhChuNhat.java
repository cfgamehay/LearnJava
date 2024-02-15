public class HinhChuNhat extends  Hinh{
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(ToaDo toaDo, double chieuDai, double chieuRong) {
        super(toaDo);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double DienTich() {
        return chieuRong*chieuDai;
    }
}
