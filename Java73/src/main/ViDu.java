package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDu {
    public static void main(String[] args) {

        try{
            File f = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\fileData.txt");
            OutputStream os = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien(1,"TITV",2000,10);
            oos.writeObject(sv);
            oos.flush();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
