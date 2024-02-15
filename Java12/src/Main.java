public class Main {
    public static void main(String[] args) {
        //khai bao
        int a = 5;
        boolean b = false;
        //hien thi
        System.out.println(" -a => giá tri: "+ (-a));// nếu a âm thì sẽ thành dương và ngược lại
        System.out.println(" +a => giá tri: "+ (+a));//không thay đổi gì cho lắm
        System.out.println(" !b => giá tri: "+ (!b));//toán tử phủ định
        System.out.println("-------");
        System.out.println("a = "+ a);
        System.out.println("++a = "+ ++a);// tăng 1 trước tính toán sau
        System.out.println("a++ = "+ a++);// tính toán trước tăng 1 sau
        System.out.println("a = "+ a);
        System.out.println("--a = "+ (--a));//giảm 1 trước tính toán sau
        System.out.println("a-- = "+ (a--));//tính toán trước giảm 1 sau
        System.out.println("a = "+ a);
    }
}
