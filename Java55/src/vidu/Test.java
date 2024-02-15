package vidu;
import java.util.Arrays;
public class Test {
    public static int[] revese(int[] a)
    {
        int[] rs = new int[a.length];
        int count = 0;
        for (int i = rs.length-1;i>=0;i--)
        {
            rs[i] = a[count];
            count++;
        }
        return rs;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,8,2,6,3,4,7,9};
        int[] b = new int[15];


        //sort
        System.out.println("Arr before sort: "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Arr after sort: "+ Arrays.toString(a));

        //binary search
        int ketQua = Arrays.binarySearch(a,4);
        int ketQua2 = Arrays.binarySearch(a,-1);
        System.out.println(ketQua);
        System.out.println(ketQua2);
        //fill
        Arrays.fill(b,5);
        System.out.println("Arr b : "+ Arrays.toString(b));
        //revese
        a=revese(a);
        System.out.println("Arr after revese: "+ Arrays.toString(a));

    }
}
