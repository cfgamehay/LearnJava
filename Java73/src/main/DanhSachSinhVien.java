package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;


    public DanhSachSinhVien() {
        danhSach = new ArrayList<SinhVien>();
    }

    public void setDanhSach(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void ThemSinhVien(SinhVien sv)
    {
        this.danhSach.add(sv);
    }
    public void InDanhSach()
    {
        for(SinhVien sv: danhSach)
        {
            System.out.println(sv);
        }
    }
    public boolean KiemTraRong()
    {
        return danhSach.isEmpty();
    }
    public int LaySoLuongSinhVien()
    {
        return danhSach.size();
    }
    public void XoaDanhSach()
    {
        danhSach.removeAll(danhSach);
    }
    public boolean KiemTraSinhVienCoTonTai(int msv)
    {
        for(SinhVien sv: danhSach)
        {
            if(sv.getMaSinhVien() == msv)
            {
                return true;
            }
        }
        return false;
    }
    public void XoaSinhVien(int msv)
    {
        for(SinhVien sv: danhSach)
        {
            if(sv.getMaSinhVien() == msv)
            {
                danhSach.remove(sv);
                System.out.println("Đã xóa sinh viên: "+sv.getHoTen());
            }
        }
        System.out.println("Không có sinh viên với mã trên.");
    }
    public void TimKiemSinhVien(String name)
    {
        for(SinhVien sv: danhSach)
        {
            if(sv.getHoTen().contains(name))
            {
                System.out.println(sv.toString());
            }
        }
    }
    public void XuatDanhSachCoDiemGiamDan()
    {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                double diemSv1 = o2.getDiemTrungBinh();
                double diemSv2 = o1.getDiemTrungBinh();

                if ((diemSv1-diemSv2)>0) {
                    return 1;
                }else if((diemSv1-diemSv2)==0)
                {
                    return 0;
                }else {
                    return -1;
                }
            }
        });
    }

    public void ghiDuLieuXuongFile(File file)
    {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for(SinhVien sv: danhSach)
            {
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
