package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    //ArrayList实现类
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("第一条数据");
        list1.add("第二条数据");
        list1.add("第三条数据");
        list1.add("第四条数据");
        list1.add("第五条数据");
        list1.add("第三条数据");
        list1.add(2, "第六条数据");  //在第三条数据后添加“第六条数据”

        System.out.println(list1.size()); //返回列表长度
        System.out.println(list1.get(2));  //返回“第六条数据”
//list1.clear(); //清除所有数据
        System.out.println(list1.isEmpty()); //返回false
        System.out.println(list1.contains("第一条数据"));  //返回true
        System.out.println(list1.indexOf("第三条数据"));  //返回3
        System.out.println(list1.lastIndexOf("第三条数据"));   //返回6
        System.out.println(list1.remove(1));  //删除“第二条数据”
        System.out.println(list1.set(0, "替换第一条数据"));  //替换第一条数据
        List list = list1.subList(2, 5);  //截取第三到第五条数据，返回List
        System.out.println(list1.toString());  //转成数组



        //使用for循环遍历
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) instanceof String){  //判断传入的数据属不属于String类型
                String str=list1.get(i);
                System.out.println(str);
            }
        }

        //迭代器遍历
        Iterator<String> iter=list.iterator();
        while(iter.hasNext()){ //判断list有没有下一条
            String s=iter.next();  //字符串取到下一条
            System.out.println(s);
        }
    }
}
