package com.study.p027;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 27 题：LinkedList 操作首尾元素
 *
 * 题目摘要：
 * 创建 LinkedList<String> 保存任务名称。
 * 要求：
 * - 添加首元素。
 * - 添加尾元素。
 * - 删除首元素。
 * - 删除尾元素。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 27 题 ======");
        System.out.println("题目：LinkedList 操作首尾元素");
        System.out.println("说明：创建 LinkedList<String> 保存任务名称。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("任务A");
        linkedList.add("任务B");
        linkedList.add("任务C");
        System.out.println("当前 LinkedList：" + linkedList);
        // TODO 学员实现：练习队列、栈、首尾操作或遍历方式。
        solve(linkedList);
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(LinkedList<String> linkedList) throws Exception {
    	linkedList.addFirst("紧急任务");
        System.out.println("添加首元素后：" + linkedList);

        linkedList.addLast("最后任务");
        System.out.println("添加尾元素后：" + linkedList);

        String removedFirst = linkedList.removeFirst();
        System.out.println("删除的首元素：" + removedFirst);
        System.out.println("删除首元素后：" + linkedList);

        String removedLast = linkedList.removeLast();
        System.out.println("删除的尾元素：" + removedLast);
        System.out.println("删除尾元素后：" + linkedList);
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
