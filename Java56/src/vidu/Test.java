package vidu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Xin chao cac ban, minh la Minh. Minh thich ga con :)";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split("\\, |\\. ");
        System.out.println(Arrays.toString(b));

        String name = "Nguyen Van A";
        String[] n = name.split(" ");
        System.out.println(n[n.length-1]);
    }
}
