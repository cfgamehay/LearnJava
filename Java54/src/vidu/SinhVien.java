package vidu;
public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }
    public String GetName()
    {
        String s = this.hoVaTen.trim();
        if(s.indexOf(" ") >= 0)
        {
            int index = s.lastIndexOf(" ");
            return s.substring(index);
        }
        return s;
    }

    @Override
    public int compareTo(SinhVien o) {
        //<0
        //=0
        //>0
        //return this.maSinhVien - o.maSinhVien; theo msv
        //theo ten
        /*
        String nameThis = this.GetName();
        String nameO = o.GetName();
        return nameThis.compareTo(nameO);
        */
        //Theo diem trung binh
        Double diemThis = this.diemTrungBinh;
        Double diemO = o.diemTrungBinh;
//        int result;
//        if(diemThis - diemO < 0)
//        {
//            result = -1;
//        }else if(diemThis - diemO > 0)
//        {
//            result = 1;
//        }else
//        {
//            result = 0;
//        }
//        return result;
        return diemThis.compareTo(diemO);
    }
}
