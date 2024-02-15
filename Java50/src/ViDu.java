import java.util.Scanner;
public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "BinhGold";
        String s2 = "binhgold";
        String s3 = "binhGold";

        //Phan biet chu hoa va chu thuong
        System.out.println("s1 === s2 :"+s1.equals(s2));
        System.out.println("s1 === s3 :"+s1.equals(s3));
        //Khon phan biet chu hoa hay chu thuong
        System.out.println("s1 == s2 :"+s1.equalsIgnoreCase(s2));
        System.out.println("s1 == s3 :"+s1.equalsIgnoreCase(s3));

        //Mat khau thi phai giong 100% > equals

        //email thì khong can phai giong 100% > equalsIgnoreCase

        //compare To (Phuong thuc so sanh)
        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van B";
        String sv3 = "Nguyen Van v";
        String sv4 = "Nguyen Van A";

        System.out.println("Âm: nho hon | 0: bang | Dương: lon hon");
        System.out.println("sv1 ? sv2 : "+sv1.compareTo(sv2));
        System.out.println("sv1 ? sv3 : "+sv1.compareTo(sv3));
        System.out.println("sv1 ? sv4 : "+sv1.compareTo(sv4));
        //compare To ignore case (Phuong thuc so sanh khong phan biet viet hoa)
        System.out.println("-1: nho hon | 0: bang | 2: lon hon");
        System.out.println("sv1 ? sv2 : "+sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 ? sv3 : "+sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 ? sv4 : "+sv1.compareToIgnoreCase(sv4));
        //regionMatches (So sanh theo đoạn)

        String r1 = "BinhGold";
        String r2 = "Gold";
        //r1 start , String need to compare (r2), r2 start, r2 end
        boolean check = r1.regionMatches(4,r2,0,4);
        System.out.println(check);

        //StartWith => kiem tra 1 chuoi co bat dau bang 1 chuoi khác hay không
        String sdt = "0169255111";
        System.out.println(sdt.startsWith("0169"));
        System.out.println(sdt.startsWith("0389"));

        //EndWith =>kiem tra 1 chuoi co ket thuc bang 1 chuoi khác hay không
        System.out.println(sdt.endsWith("111"));
        System.out.println(sdt.endsWith("222"));
    }
}
