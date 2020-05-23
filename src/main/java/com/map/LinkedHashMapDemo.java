package com.map;

import com.domain.User;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<User,String> lhs = new LinkedHashMap<>();
        lhs.put(new User(1, "周一", "123456", 20),"深圳");
        lhs.put(new User(2, "周二", "789456", 20),"上海");
        lhs.put(new User(3, "周三", "152446", 20),"上海");
        lhs.put(new User(3, "周三", "152446", 20),"深圳");
        lhs.put(new User(4, "周四", "712365", 20),"北京");

        //for遍历
        for (User key : lhs.keySet()) {                    //遍历
            System.out.println(key.getUserName() + " 在 " + lhs.get(key));
        }

    }
}
