import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1,3,5,7,8,10,12 -> 31
        //4,6,9,11 -> 30
        //2 -> 28 (nhuan 29)
        Scanner sc = new Scanner(System.in);
        int thang, nam;
        System.out.println("Nhap thang:");
        thang = sc.nextInt();
        switch (thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                System.out.println("Co 31 ngay");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                System.out.println("Co 30 ngay");
                break;
            }
            case 2:
            {
                System.out.println("Nhap nam: ");
                nam = sc.nextInt();
                if(nam % 4 ==0 && nam % 100 != 0)
                {
                    System.out.println("Co 29 ngay");
                }else
                {
                    System.out.println("Co 28 ngay");
                }

                break;
            }
            default:
            {
                System.out.println("Nhap sai roi nhap lai di!");
            }
        }
    }
}
