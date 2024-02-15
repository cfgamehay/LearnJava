package main;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> SvList = new LinkedList<String>();
        SvList.offer("Binh");
        SvList.offer("Minh");
        SvList.offer("Toan");
        while(!SvList.isEmpty())
        {
            System.out.println(SvList.poll());
        }
    }
}
