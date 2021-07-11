package edu.ahut.practice;

import javafx.util.Pair;

import java.util.*;
/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.collection
 * @ClassName: CountWordWithMap
 * @author: wang
 * @create: 2021/07/11 10:10
 * @Version: 1.0
 */
public class CountWordWithMap {
    static Scanner cin=new Scanner(System.in);
    public static void main(String[] args) {
        String str=cin.nextLine().toString();
        String []words=str.trim().toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(words));
        Map<String,Integer> map=new TreeMap<>();
        for (String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else {
                map.put(word, 1);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key+"---"+value);
        });
        Queue<Pair<String,Integer>> queue=new PriorityQueue<>((o1, o2) -> {
            if(!o1.getValue().equals(o2.getValue())){
                return o2.getValue()-o1.getValue();
            }
            return o1.getKey().compareTo(o2.getKey());
        });
    }
}
