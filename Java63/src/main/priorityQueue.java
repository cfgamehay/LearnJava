package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<String> SvList = new PriorityQueue<String>();
        SvList.offer("Binh");
        SvList.offer("An");
        SvList.offer("Minh");
        SvList.offer("Toan");
        while(!SvList.isEmpty())
        {
            System.out.println(SvList.poll());
        }
    }
}
