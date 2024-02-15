import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String s = sc.nextLine();

        System.out.println("-------------");
        //Do dai chuoi
        System.out.println("Length: "+ s.length());

        System.out.println("-------------");
        //Tra ve ki tu tai vi tri i
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Kí tự tại vị trí "+i+": "+s.charAt(i));
        }
        System.out.println("-------------");
        //get chars
        char[] arrChar = new char[100];
        s.getChars(0,5,arrChar,0);
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println("Kí tự tại vị trí "+i+": "+arrChar[i]);
        }
        System.out.println("-------------");
        //get byte (tra ve ma ascii)
        byte[] arrBytes = s.getBytes();
        for(Byte b : arrBytes)
        {
            System.out.println(b);
        }

    }

}
