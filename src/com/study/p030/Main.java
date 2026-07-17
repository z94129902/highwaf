package com.study.p030;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 30 题：ArrayList 与 LinkedList 插入性能对比
 *
 * 题目摘要：
 * 分别使用 ArrayList 和 LinkedList 在集合开头插入大量数据。
 * 要求：
 * - 使用 System.currentTimeMillis() 统计耗时。
 * - 输出性能差异。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 30 题 ======");
        System.out.println("题目：ArrayList 与 LinkedList 插入性能对比");
        System.out.println("说明：分别使用 ArrayList 和 LinkedList 在集合开头插入大量数据。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("任务A");
        linkedList.add("任务B");
        linkedList.add("任务C");
        
        System.out.println("当前 LinkedList：" + linkedList);
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("任务1");
        arrayList.add("任务2");
        arrayList.add("任务3");
        
        System.out.println("当前 ArrayList：" + arrayList);
        
        solve(linkedList, arrayList);
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(LinkedList<String> linkedList, ArrayList<String> arrayList) throws Exception {
    	long starttime1 = System.currentTimeMillis();
    	for(int i = 0; i < 30000; i++) {
    		linkedList.addFirst("测试");
    	}
    	long endtime1 = System.currentTimeMillis();
    	long usedtime1 = endtime1 - starttime1;
    	System.out.println("spent time of linkedList:" + usedtime1);
    	
    	long starttime2 = System.currentTimeMillis();
    	for(int i = 0; i < 30000; i++) {
    		arrayList.addFirst("测试");
    	}
    	long endtime2 = System.currentTimeMillis();
    	long usedtime2 = endtime2 - starttime2;
    	System.out.println("spent time of arrayList:" + usedtime2);
    	
    	
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
