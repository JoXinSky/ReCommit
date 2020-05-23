package com.map;

import com.domain.User;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    //将User对象先按年龄排序，再按名字排序
    public static void main(String[] args) {
//        TreeMap<User,String> tm = new TreeMap<>(new Comparator<User>() {
//            @Override
//            public int compare(User s1, User s2) {
//                int num = s1.getAge()-s2.getAge();
//                //s1.getName().compareTo(s2.getName())这里的compareTo方法是String类中的方法
//                return num==0?s1.getUserName().compareTo(s2.getUserName()):num;
//            }
//        });

        TreeMap<User,String> tm = new TreeMap<>();
        tm.put(new User(1, "周一", "123456", 35),"深圳");
        tm.put(new User(2, "周b", "789456", 20),"上海");
        tm.put(new User(3, "周a", "152446", 20),"深圳");
        tm.put(new User(4, "周四", "712365", 15),"北京");
        //for遍历
        for (User key : tm.keySet()) {
            System.out.println(key.getUserName() + "  " + tm.get(key));
        }


    }

}
