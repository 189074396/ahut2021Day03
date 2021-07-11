package edu.ahut.collection;

import java.util.Arrays;
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
public class UniqueSortNumber00 {
    public static void main(String[] args) {
        int []a=new int[10];
        int n=0;
        //crtl+z、crtl+d结束
        while (cin.hasNext()){
            if(n==a.length){//已有容量用完
                int[]b=new int[a.length<<1];
//                for (int i=0;i<n;i++){
//                    b[i]=a[i];
//                }
                System.arraycopy(a,0,b,0,n);
                a=b;
            }
            a[n++]=cin.nextInt();
        }
        Arrays.sort(a,0,n);
        int []b=new int[n];
        int m=0;
        b[m++]=a[0];
        for (int i=1;i<n;i++){
           if(a[i]==a[i-1]){
              continue;
           }
            b[m++]=a[i];
        }
        for (int i=0;i<m;i++){
            System.out.println(b[i]);
        }
    }
    static Scanner cin=new Scanner(System.in);
}
