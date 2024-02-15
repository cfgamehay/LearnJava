public class ViDu {
    public static void main(String[] args) {
        String s1 = "Binh";
        String s2 = "Gold";
        String s3 = s1+s2;

        //String là bất biến
        //Concat

        String s4 = s1.concat(s2); //=> Tra ve 1 string moi

        System.out.println("S3: "+s3);
        System.out.println("S4: "+s4);
        //Replace > thay đổi > return ve 1 string

        String s5 = "BinhGOLD";
        String s6 = s5.replaceAll("Binh","Bottle");
        System.out.println(s6);
        //ToLowerCase return string > viet thuong
        //ToUpperCase return string > viet hoa
        System.out.println("S3 to lower case: "+s3.toLowerCase());
        System.out.println("S4 to upper case: "+s4.toUpperCase());
        //Trim xóa khoảng trắng hai bên
        String s7 = "   Hello Im Binh        ";
        System.out.println("s7: "+s7);
        System.out.println("s7 with trim(): "+s7.trim());
        //subString > cắt chuỗi
        String s8 = "It is great to see you!";
        String s9 = s8.substring(6,18);//bắt đầu tại vị trí 6 kết thúc ở vị trí 16 (6-17)
        System.out.println("s9 :" + s9);
    }
}