package edu.ahut.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: ahut2021Day03
 * @description:顺序队列
 * @Package: edu.ahut.collection
 * @ClassName: QueueDemo
 * @author: wang
 * @create: 2021/07/11 10:40
 * @Version: 1.0
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        for (int i=0;i<10;i++){
            queue.offer(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
