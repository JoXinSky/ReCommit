package com.collection.set;

import com.domain.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<User> hs = new HashSet<>();

        Set<User> set2=new LinkedHashSet<User>();
        set2.add(new User(1, "周一", "123456", 20));
        set2.add(new User(2, "周二", "789456", 20));
        set2.add(new User(3, "周三", "152446", 20));
        set2.add(new User(3, "周三", "152446", 20));
        set2.add(new User(4, "周四", "712365", 20));

        //迭代器遍历
        Iterator<User> iter=set2.iterator();
        while(iter.hasNext()){
            User user=iter.next();
            System.out.println(user.getId()+"\t"+user.getUserName());
        }

    }
}
