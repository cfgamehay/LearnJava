public class MyMath {
    public static int Min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public static double Min(double a, double b) {
        if (a > b) {
            return b;
        }
        return a;
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static double Sum(double a, double b) {
        return a + b;
    }

    public static int Sum(double[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong;
    }
}
