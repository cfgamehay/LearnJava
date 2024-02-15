package vidu;

public class Test {
    public static void main(String[] args) {
        SinhVien s1 = new SinhVien(4,"Binh","DTH5",8.5);
        SinhVien s2 = new SinhVien(2,"Dat","DTH8",8.6);

        System.out.println(s1.compareTo(s2));
    }
}
