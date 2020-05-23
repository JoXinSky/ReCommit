package com.map;

import com.domain.User;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<User,String> hm = new HashMap<>();
        hm.put(new User(1, "周一", "123456", 20),"深圳");
        hm.put(new User(2, "周二", "789456", 20),"上海");
        hm.put(new User(3, "周三", "152446", 20),"上海");
        hm.put(new User(3, "周三", "152446", 20),"深圳");
        hm.put(new User(4, "周四", "712365", 20),"北京");
        System.out.println(hm.containsKey(new User(3, "周三", "152446", 20)));  //返回true
        System.out.println(hm.containsValue("qq"));  //返回false
        System.out.println(hm.get(new User(2, "周二", "789456", 20)));  //返回bbbbbb


        //先取键，再遍历取值
        Set<User> keys=hm.keySet();  //取到所有键
        Iterator<User> iter=keys.iterator();
        while(iter.hasNext()){ //迭代器遍历取到每一个键
            User key=iter.next();
            System.out.println(key.getUserName()+" key遍历 "+hm.get(key)); //key:取到键    map1.get(key):取到每个键对应的值
        }

        //直接遍历值
        Collection<String> values = hm.values();
        Iterator<String> iter1= values.iterator();
        while(iter1.hasNext()){
            System.out.println(" value遍历 "+iter1.next());
        }

        //entry键值对遍历
        Set<Map.Entry<User,String>> set= hm.entrySet();  //获取所有的键值对象的集合
        Iterator<Map.Entry<User,String>> iter2=set.iterator();
        while(iter2.hasNext()){
            Map.Entry<User,String> entry=iter2.next();
            System.out.println(entry.getKey().getUserName()+" entry遍历 "+entry.getValue());
        }


        //for遍历
        for (User key : hm.keySet()) {
            System.out.println(key.getUserName() + " for遍历 " + hm.get(key));
        }
        //System.out.println(hm);
    }

}
