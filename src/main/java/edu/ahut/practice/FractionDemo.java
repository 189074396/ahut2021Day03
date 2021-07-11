package edu.ahut.practice;

import java.util.*;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.practice
 * @ClassName: FractionDemo
 * @author: wang
 * @create: 2021/07/11 15:10
 * @Version: 1.0
 */
public class FractionDemo {
    public static void main(String[] args) {
        List<Fraction> list=new ArrayList<Fraction>();
        for (int i=0;i<20;i++){
            list.add(new Fraction(1,(i+1)));
        }
        Fraction fraction=new Fraction(0,0);
        for (int i=0;i<20;i++){
            try {
                fraction=fraction.add(list.get(i));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(fraction);
        System.out.println((double)fraction.getNumerator()/fraction.getDenominator());
    }
}
