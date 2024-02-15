import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        //int[] array1 = new int[]{1,2,3};
        int[] array1_clone_a = array1;
        int[] array1_clone_b = array1.clone();
        int[] array1_clone_c = new int[array1.length];
        //arr nguồn, vị trí copy, array đích, vị trí sẽ copy đến, số phần tử cần copy.
        System.arraycopy(array1,0,array1_clone_c,0,array1.length);

        array1[0] = 100;
        //Khi thay doi array 1 thi chi co array 1 clone a la thay doi gia tri
        //con hai cai con lai khong anh huong
        System.out.println("array 1: "+Arrays.toString(array1));
        System.out.println("array 1 clone a: "+Arrays.toString(array1_clone_a));
        System.out.println("array 1 clone b: "+Arrays.toString(array1_clone_b));
        System.out.println("array 1 clone c: "+Arrays.toString(array1_clone_c));

    }
}
