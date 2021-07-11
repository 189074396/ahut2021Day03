package edu.ahut.practice;

import java.util.Comparator;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.practice
 * @ClassName: FractionComparator
 * @author: wang
 * @create: 2021/07/11 15:29
 * @Version: 1.0
 */
public class FractionComparator implements Comparator<Fraction> {
    @Override
    public int compare(Fraction o1, Fraction o2) {
        return (int) o1.sub(o2).getNumerator();
    }
}
