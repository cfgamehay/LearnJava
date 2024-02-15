package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class deque {
    public static void main(String[] args) {
        Deque<String> SvList = new ArrayDeque<>();
        SvList.offer("Binh");
        SvList.offer("An");
        SvList.offer("Minh");
        SvList.offer("Toan");
        SvList.offerLast("ssss");
        SvList.offerFirst("Zũng");

        while(!SvList.isEmpty())
        {
            System.out.println(SvList.poll());
        }

    }
}
