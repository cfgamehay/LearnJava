public class MayTinhVinaCal500 implements MayTinhBoTuiInterface{
    @Override
    public double Cong(double a, double b) {
        return a+b;
    }

    @Override
    public double Tru(double a, double b) {
        return a-b;
    }

    @Override
    public double Nhan(double a, double b) {
        return a*b;
    }

    @Override
    public double Chia(double a, double b) {
        if(b==0)
        {
            System.out.println("khong chia duoc cho 0!");
            return 0;
        }
        else
        {
            return a/b;
        }
    }
}
