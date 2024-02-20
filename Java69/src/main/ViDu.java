package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDu {

    public static void xoaHetFile(File f)
    {


        if(f.isDirectory())
        {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                xoaHetFile(fx);
            }
            System.out.println(f.getAbsolutePath());
            f.delete();
        }
        else if(f.isFile())
        {
            System.out.println(f.getAbsolutePath());
            f.delete();
        }
    }
    public static void xoaFile2(File f)
    {
        Path p;
        if(f.isDirectory())
        {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon)
            {
                xoaFile2(fx);
            }
            p = f.toPath();
            try{
                Files.delete(p);
            }catch (Exception e){
                System.out.println(e);
            }
        }else if(f.isFile())
        {
            p = f.toPath();
            try{
                Files.delete(p);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f1");
        File f2 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f2");
        File f3 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f3");
        //f0.delete();
        // xoa thu muc rong f.delete();
        // xoa het f.deleteOnExit();
        //xoaHetFile(f0);

        Path p1 = f1.toPath();
        xoaFile2(f3);
    }
}
