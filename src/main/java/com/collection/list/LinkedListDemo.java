package com.collection.list;

import com.domain.User;

import java.util.LinkedList;

public class LinkedListDemo {
    //LinkedList实现类
    public static void main(String[] args) {
        LinkedList<User> list=new LinkedList<User>();
        list.add(new User(1,"周一","123456",20));
        list.add(new User(2,"周二","789456",20));
        list.add(new User(3,"周三","152446",20));
        list.add(new User(4,"周四","712365",20));
        list.addFirst(new User(0,"周零","152446",20));
        list.removeLast();  //删除最后一位，即周四
        list.addLast(new User(5,"周五","956153",20));
        System.out.println(list.contains(new User(3,"周三","152446",20)));  //返回为true；重写equals()方法；如果不重写equals()方法，返回为false；
        System.out.println(list.remove(new User(1,"周一","123456",20)));  //返回为true


        /*
         * foreach遍历
         */
        for (User news : list) {
            System.out.println(news.getId()+"   "+news.getUserName()+"\t"+news.getPassword());
        }



    }
}
