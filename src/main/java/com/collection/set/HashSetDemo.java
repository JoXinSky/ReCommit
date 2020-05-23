package com.collection.set;

import com.domain.User;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<User> hs = new HashSet<>();
        hs.add(new User(1, "周一", "123456", 20));
        hs.add(new User(2, "周二", "789456", 20));
        hs.add(new User(3, "周三", "152446", 20));
        hs.add(new User(3, "周三", "152446", 20));
        hs.add(new User(4, "周四", "712365", 20));

        //遍历集合
        for (User user : hs) {
            System.out.println(user.getUserName() + ":" + user.getAge());
        }
    }
}
