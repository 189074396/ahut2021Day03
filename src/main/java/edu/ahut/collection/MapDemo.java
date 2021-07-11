package edu.ahut.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: ahut2021Day03
 * @description:
 * @Package: edu.ahut.collection
 * @ClassName: MapDemo
 * @author: wang
 * @create: 2021/07/11 10:01
 * @Version: 1.0
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> users=new HashMap<>();
        users.put("tom","cat");
        users.put("guest","1234");
        users.put("root","root");
        users.remove("tom");
        users.put("guest","1234456");
        String password=users.get("guest");
        System.out.println(users);
        System.out.println(password);
        System.out.println(users.containsKey("tom"));
        System.out.println(users.keySet());
        System.out.println(users.values());
    }
}
