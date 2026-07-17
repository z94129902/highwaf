package com.study.p026;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 26 题：LinkedList 模拟栈
 *
 * 题目摘要：
 * 使用 LinkedList<Integer> 模拟栈。
 * 要求：
 * - 使用 push 入栈。
 * - 使用 pop 出栈。
 * - 使用 peek 查看栈顶。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 26 题 ======");
        System.out.println("题目：LinkedList 模拟栈");
        System.out.println("说明：使用 LinkedList<Integer> 模拟栈。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        solve();
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve() throws Exception {
    	LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        int topNumber = linkedList.peek();

        System.out.println("当前栈顶元素：" + topNumber);
        System.out.println("查看栈顶后的栈：" + linkedList);

      
        linkedList.push(40);

        System.out.println("40 入栈后：" + linkedList);

        int removedNumber = linkedList.pop();

        System.out.println("出栈的元素：" + removedNumber);
        System.out.println("出栈后的栈：" + linkedList);
    }

    private static String readLine(String message) {
        System.out.print(message);
        return SCANNER.nextLine();
    }

    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = SCANNER.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("请输入合法整数。");
            }
        }
    }

    static class DemoObject {
        private String name;
        private int score;

        DemoObject(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "DemoObject{name='" + name + "', score=" + score + "}";
        }
    }

    static class Box<T> {
        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    static class Student implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }
    }

    static class MailConfig {
        String smtpHost;
        int port = 465;
        String from;
        boolean ssl = true;

        @Override
        public String toString() {
            return "MailConfig{smtpHost='" + smtpHost + "', port=" + port + ", from='" + from + "', ssl=" + ssl + "}";
        }
    }
}
