package com.collection.set;

import com.domain.User;

import java.util.Comparator;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //将User对象先按年龄，再按名字排序
//        TreeSet<User> ts = new TreeSet<>(new Comparator<User>() {
//            @Override
//            public int compare(User s1, User s2) {
//                int num = s1.getAge() - s2.getAge();
//                //s1.getName().compareTo(s2.getName())这里的compareTo方法是String类中的方法
//                return num == 0 ? s1.getUserName().compareTo(s2.getUserName()) : num;
//            }
//        });
//
        TreeSet<User> ts = new TreeSet<>();

        ts.add(new User(1, "周一", "123456", 35));
        ts.add(new User(2, "周b", "789456", 20));
        ts.add(new User(3, "周a", "152446", 20));
        ts.add(new User(4, "周四", "712365", 15));
        //for遍历
        for (User key : ts) {
            System.out.println(key.getUserName() + "  " + key.getAge());
        }
    }
}
