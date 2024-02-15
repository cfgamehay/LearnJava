public class Main {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        MayTinhCasio mfx500 = new MayTinhCasio();
        MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();

        System.out.println("5+3=" + mfx500.Cong(5, 3));
        System.out.println("4*5=" + mvn500.Nhan(4, 5));
        System.out.println("4/0=" + mvn500.Chia(4, 0));

        System.out.println("Test câu b: ");
        double[] arr = new double[]{5, 1, 3, 4, 5, 8, 0};
        double[] arr2 = new double[]{6, 2, 7, 9, 2, 4, 5};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        sxchen.SapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sxchon.SapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Test câu c:");
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3+5=" + pmmt.Cong(3, 5));
        double[] arr3 = new double[]{6, 2, 7, 9, 2, 4, 5};
        pmmt.SapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
