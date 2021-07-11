package edu.ahut.collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: ahut2021Day03
 * @description:优先级队列
 * @Package: edu.ahut.collection
 * @ClassName: QueueDemo
 * @author: wang
 * @create: 2021/07/11 10:40
 * @Version: 1.0
 */
public class QueueDemo2 {
    public static void main(String[] args) {
//        Queue<Integer> queue=new PriorityQueue<>();
        Queue<Integer> queue=new PriorityQueue<>((o1, o2) -> {return o2-o1;});
        for (int i=0;i<10;i++){
            int x=(int)(Math.random()*100);
            System.out.println("offer "+x+"....");
            queue.offer(x);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
