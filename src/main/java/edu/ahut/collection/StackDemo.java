package edu.ahut.collection;

import java.util.Stack;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.collection
 * @ClassName: StackDemo
 * @author: wang
 * @create: 2021/07/11 10:34
 * @Version: 1.0
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<10;i++){
            s.push(i);
        }
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}
