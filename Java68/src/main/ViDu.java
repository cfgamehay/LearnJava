package main;

import java.io.File;
import java.util.Scanner;

public class ViDu {

    private File file;

    public ViDu(String path) {
        this.file = new File(path);
    }

    public boolean KiemTraThucThi()
    {
        return this.file.canExecute();
    }
    public  boolean KiemTraDoc()
    {
        return this.file.canRead();
    }
    public boolean KiemTraGhi()
    {
        return this.file.canWrite();
    }
    public void InDuongDan()
    {
        System.out.println(this.file.getAbsolutePath());
    }
    public void InTen()
    {
        System.out.println(this.file.getName());
    }
    public void KiemTraLaThuMucHayTapTin()
    {
        if(this.file.isFile())
        {
            System.out.println("Day la tap tin");
        }else{
            System.out.println("Day la thu muc");
        }
    }
    public void InDanhSachCacFileCon()
    {
    if(this.file.isDirectory())
    {
        File[] mangCon;
        mangCon = this.file.listFiles();

        for(File f:mangCon)
        {
            System.out.println(f.getAbsolutePath());
        }
    }else
    {
        System.out.println("Day la tep tin nen khong co thu muc ben trong");
    }
    }
    public void InCayThuMuc()
    {
        this.InChiTietCayThuMuc(this.file, 1);
    }
    public void InChiTietCayThuMuc(File f,int bac)
    {
        for(int i = 0;i <bac;i++)
        {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());


        if(f.isDirectory()){
            File[] mangCon = f.listFiles();
            for (File fx : mangCon)
            {
                InChiTietCayThuMuc(fx,bac+1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        System.out.println("Nhap ten file: ");
        String path = sc.nextLine();
        ViDu vdf = new ViDu(path);
        do{
            System.out.println("MENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình.");
            luaChon = sc.nextInt();

            switch (luaChon)
            {
                case 1:{
                    System.out.println(vdf.KiemTraThucThi());
                    break;
                }
                case 2:{
                    System.out.println(vdf.KiemTraDoc());
                    break;
                }
                case 3:{
                    System.out.println(vdf.KiemTraGhi());
                    break;
                }
                case 4:{
                    vdf.InDuongDan();
                    break;
                }
                case 5:{
                    vdf.InTen();
                    break;
                }
                case 6:{
                    vdf.KiemTraLaThuMucHayTapTin();
                    break;
                }
                case 7:{
                    vdf.InDanhSachCacFileCon();
                    break;
                }
                case 8:{
                    vdf.InCayThuMuc();
                    break;
                }
            }
        }while(luaChon != 0);
    }
}
