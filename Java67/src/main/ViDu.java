package main;

import java.io.File;
import java.io.IOException;

public class ViDu {
    public static void main(String[] args) throws IOException {
        // Windows dùng -> \\
        //linux + macOs -> /
        File f1 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile");

        System.out.println(f1.exists());
//tạo folder
        File f2 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\newDocument");
        //tao 1 thu muc
        f2.mkdir();
        //tao nhieu thu muc
        f2 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\newDocument\\newDocument2\\newDocument3\\newDocument4");
        f2.mkdirs();
//tao tep tin
        File f3 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\file.txt");
        try {
            f3.createNewFile();
        }catch (Exception e)
        {
            System.out.println(e);
        }



    }
}
