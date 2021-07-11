package edu.ahut.collection;

import java.util.*;

/**
 * @program: ahut2021Day03
 * @description:键盘输入个数不确定，对这些数去重排序
 * @Package: edu.ahut.collection
 * @ClassName: UniqueSortNumber00
 * @author: wang
 * @create: 2021/07/11 08:58
 * @Version: 1.0
 */
public class UniqueSortNumber02 {
    public static void main(String[] args) {
        //Set<Integer> a=new HashSet<Integer>();
        Set<Integer> a=new TreeSet<Integer>();
        while (cin.hasNext()){
           int cur=cin.nextInt();
           a.add(cur);
        }
        for (Integer i:a) {
            System.out.print(i+" ");
        }
        System.out.println("\ntotal m="+a.size());
    }
    static Scanner cin=new Scanner(System.in);
}
