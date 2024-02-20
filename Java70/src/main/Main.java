package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void copyAll(File f1, File f2)
    {
        try{
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e)
        {
            System.out.println(e);
        }

        if(f1.isDirectory())
        {
            File[] mangCon = f1.listFiles();
            for (File file : mangCon)
            {
                File newFile = new File(f2.getAbsolutePath()+"\\"+file.getName());
                copyAll(file,newFile);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f1.txt");
        File f2 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f2");
        File f3 = new File("E:\\SchoolFile\\LapTrinhMang\\Java\\testFile\\f2_copy");
        //f1.renameTo(f2);

        //Files.move(f2.toPath(),f3.toPath(), StandardCopyOption.REPLACE_EXISTING);

        copyAll(f2,f3);
        //Files.copy(f2.toPath(),f3.toPath(),StandardCopyOption.REPLACE_EXISTING);
    }
}
