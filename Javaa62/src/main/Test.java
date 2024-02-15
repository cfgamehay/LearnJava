package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Stack<String> stackChuoi = new Stack<String>();
//
//        System.out.print("Nhap chuoi muốn đảo: ");
//        String chuoi = sc.nextLine();
//
//
//        for (int i = 0; i < chuoi.length(); i++) {
//            stackChuoi.push(chuoi.charAt(i) + "");
//        }
//        String newChuoi = "";
//
//        while (!stackChuoi.empty()) {
//            System.out.print(stackChuoi.pop());
//        }
//        System.out.println(newChuoi);


        Stack stackSoNguyen = new Stack();
        System.out.println("Nhập số nguyên: ");
        int x = sc.nextInt();

        while(x>0)
        {
            stackSoNguyen.push(x%2);
            x/=2;
        }
        while(!stackSoNguyen.empty())
        {
            System.out.print(stackSoNguyen.pop());
        }

    }
}
