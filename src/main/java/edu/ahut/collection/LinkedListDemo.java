package edu.ahut.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.collection
 * @ClassName: LinkedListDemo
 * @author: wang
 * @create: 2021/07/11 10:59
 * @Version: 1.0
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        //List<Integer> list=new LinkedList<Integer>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<200000;i++){
            list.add(i);
        }
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        long end=System.currentTimeMillis();
        System.out.println((end-start)/1000.0+"second(s).");
    }
}
