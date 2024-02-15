public class HinhTron extends Hinh{
    private double r;
    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    @Override
    public double DienTich() {
        return Math.PI*this.r*this.r;
    }
}
