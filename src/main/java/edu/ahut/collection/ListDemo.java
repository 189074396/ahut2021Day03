package edu.ahut.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.collection
 * @ClassName: ListDemo
 * @author: wang
 * @create: 2021/07/11 08:46
 * @Version: 1.0
 */
public class ListDemo {
    List<String>  list=new Vector<String>();

    public static void main(String[] args) {
        List<Integer> list=new Vector<Integer>();
        for (int i=0;i<4;i++){
            list.add(i);
        }

        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
