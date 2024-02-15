import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bai tap hinh tron
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap r: ");
        r = sc.nextDouble();

        chuVi = 2*Math.PI*r;
        dienTich = Math.PI * Math.pow(r,2);


        System.out.println("Chu vi: "+ chuVi);
        System.out.println("Chu vi = "+ Math.round(chuVi));
        System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
        System.out.println("Dien tich: "+dienTich);
        System.out.println("Dien tich = " + Math.round(dienTich));
        System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
    }
}
