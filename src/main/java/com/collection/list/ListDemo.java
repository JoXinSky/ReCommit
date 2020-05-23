package com.collection.list;

import java.util.*;

public class ListDemo {
    //特定的Iterator子接口:ListIterator的使用
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("哈哈");
        list.add("我");
        list.add("阿萨达");

        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String str = (String)it.next();
//            if(str.equals("我")){
//                list.add("是");  //这里会抛出ConcurrentModificationException并发修改异常
//            }
//            System.out.println(str);
//        }
        while(it.hasNext()) {
            //iterator.next()返回迭代的下一个元素
            System.out.println(it.next());
        }

        ListIterator lit = list.listIterator();    //如果想在遍历的过程中添加元素,要用ListIterator中的add方法
        while(lit.hasNext()) {
            String str = (String)lit.next();
            if(str.equals("我")) {
                lit.add("是");
            }
        }
        Iterator<String> it2 = list.iterator();
        while(it2.hasNext()) {
            //iterator.next()返回迭代的下一个元素
            System.out.println(it2.next());
        }


    }
}
