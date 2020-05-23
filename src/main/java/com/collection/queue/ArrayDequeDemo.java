package com.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args)
    {
        ArrayDeque stack = new ArrayDeque();
        // 依次将三个元素push入"栈"
        stack.push("循循渐进Linux");
        stack.push("小学语文");
        stack.push("时间简史");
        // 输出：[时间简史, 小学语文, 循循渐进Linux]
        System.out.println(stack);
        // 访问第一个元素，但并不将其pop出"栈"，输出：时间简史
        System.out.println(stack.peek());
        // 依然输出：[时间简史, 小学语文, 循循渐进Linux]
        System.out.println(stack);
        // pop出第一个元素，输出：时间简史
        System.out.println(stack.pop());
        // 输出：[小学语文, 循循渐进Linux]
        System.out.println(stack);

        ArrayDeque queue = new ArrayDeque();
        // 依次将三个元素加入队列
        queue.offer("光头强");
        queue.offer("熊大");
        queue.offer("熊二");
        // 输出：[光头强, 熊大, 熊二]
        System.out.println(queue);
        // 访问队列头部的元素，但并不将其poll出队列"栈"，输出：光头强
        System.out.println(queue.peek());
        // 依然输出：[光头强, 熊大, 熊二]
        System.out.println(queue);
        // poll出第一个元素，输出：光头强
        System.out.println(queue.poll());
        // 输出：[熊大, 熊二]
        System.out.println(queue);

    }

}
