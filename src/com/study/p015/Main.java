package com.study.p015;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 15 题：集合排序
 *
 * 题目摘要：
 * 定义一个 ArrayList<Integer> 保存多个整数。
 * 要求：
 * - 使用 Collections.sort() 升序排序。
 * - 使用自定义比较器降序排序。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 15 题 ======");
        System.out.println("题目：集合排序");
        System.out.println("说明：定义一个 ArrayList<Integer> 保存多个整数。");
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
    	ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(35);
        numberList.add(12);
        numberList.add(78);
        numberList.add(5);
        numberList.add(46);
        
        Collections.sort(numberList);
        System.out.println("升序：" + numberList);
        ArrayList<Integer> descendingList = new ArrayList<>();
        for(int i = numberList.size()-1; i >= 0; i--) {
        	descendingList.add(numberList.get(i));
        }
        System.out.println("降序：" + descendingList);
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
