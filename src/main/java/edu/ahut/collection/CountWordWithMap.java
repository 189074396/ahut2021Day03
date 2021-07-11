package edu.ahut.collection;

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
    public static void main(String[] args) {
        String str="To     know everything is to know nothing.  ";
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

        if(map.size()>10){
            int j=0;
            for (Map.Entry<String,Integer> entry:map.entrySet()){
                if(j<10){
                    System.out.println(entry.getKey()+":"+entry.getValue());
                    j++;
                }
            }
        }else {
            for (Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
