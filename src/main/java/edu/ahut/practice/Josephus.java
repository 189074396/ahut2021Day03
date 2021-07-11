package edu.ahut.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.practice
 * @ClassName: Josephus
 * @author: wang
 * @create: 2021/07/11 15:50
 * @Version: 1.0
 */
public class Josephus {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            list.add(i+1);
        }
        System.out.println(list);
        int countNum=scanner.nextInt();
        int k = 0;
        while (list.size() > 0) {
            k = k + countNum;
            k = k % (list.size()) - 1;
            if (k < 0) {
                System.out.print(list.get(list.size() - 1)+" ");
                list.remove(list.size() - 1);
                k = 0;
            } else {
                System.out.print(list.get(k)+" ");
                list.remove(k);
            }
        }
        System.out.println();
    }
}
