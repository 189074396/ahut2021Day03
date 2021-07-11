package edu.ahut.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: ahut2021Day03
 * @description:优先级队列
 * @Package: edu.ahut.collection
 * @ClassName: QueueDemo
 * @author: wang
 * @create: 2021/07/11 10:40
 * @Version: 1.0
 */
public class QueueDemo1 {
    public static void main(String[] args) {
        Deque<Integer> queue=new LinkedList<>();
        queue.addLast(1);
        queue.addFirst(2);
        queue.addLast(3);

        queue.addFirst(4);
        queue.pollFirst();
        queue.pollLast();
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
    }
}
