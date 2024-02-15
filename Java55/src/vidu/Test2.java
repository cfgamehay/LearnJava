package vidu;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(3,"linh","DTH5",8.5);
        SinhVien sv2 = new SinhVien(2,"Dat","DTH8",8.6);
        SinhVien sv3 = new SinhVien(5,"Nhat","DTH1",8.7);
        SinhVien sv4 = new SinhVien(9,"Minh","DTH2",8.7);

        SinhVien[] svList = new SinhVien[] {sv1,sv2,sv3,sv4};

        System.out.println(Arrays.toString(svList));
        Arrays.sort(svList);//Phải có Phương thức compareTo thì mới có thể sort
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(svList));
        //Search
        System.out.println(Arrays.binarySearch(svList,sv4));//check theo giá trị của phương thức compare to
    }
}
