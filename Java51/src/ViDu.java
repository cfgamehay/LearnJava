public class ViDu {
    public static void main(String[] args) {
        String s1 = "Hello every one! Hello!";
        String s2 = "Hello";
        String s3 = "Hello12";
        //Tra ve vi tri cua s2 trong s1 neu khong co thi tra ve -1
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s3));
        //Tra ve vi tri cua se tu vi tri n tro di
        System.out.println(s1.indexOf(s2,2));
        //last index of tim kiem tu phai sang trai
        System.out.println(s1.lastIndexOf(s2));



    }

}
