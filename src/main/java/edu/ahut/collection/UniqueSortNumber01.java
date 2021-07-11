package edu.ahut.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @program: ahut2021Day03
 * @description:键盘输入个数不确定，对这些数去重排序
 * @Package: edu.ahut.collection
 * @ClassName: UniqueSortNumber00
 * @author: wang
 * @create: 2021/07/11 08:58
 * @Version: 1.0
 */
public class UniqueSortNumber01 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        while (cin.hasNext()){
           int cur=cin.nextInt();
           if(a.contains(cur)){
               continue;
           }
           a.add(cur);
        }
        Collections.sort(a);
        for (Integer i:a) {
            System.out.print(i+" ");
        }
        System.out.println("\ntotal m="+a.size());
    }
    static Scanner cin=new Scanner(System.in);
}
