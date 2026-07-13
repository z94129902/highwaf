package com.study.p011;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 11 题：Collection 常用方法练习
 *
 * 题目摘要：
 * 创建两个 Collection<String> 集合。
 * 要求练习：
 * - add
 * - remove
 * - contains
 * - size
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 11 题 ======");
        System.out.println("题目：Collection 常用方法练习");
        System.out.println("说明：创建两个 Collection<String> 集合。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        // TODO 学员实现：根据题目要求完成增删改查、排序、分页或对象存储。
        solve();
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve() throws Exception {
    	Collection<String> first = new ArrayList<>();
        Collection<String> second = new ArrayList<>();

        first.add("张三");
        first.add("李四");
        first.add("王五");

        second.add("赵六");
        second.add("钱七");

        System.out.println("第一个集合：" + first);
        System.out.println("第二个集合：" + second);

        first.remove("李四");
        System.out.println("第一个集合删除李四后：" + first);

        System.out.println("第一个集合是否包含张三：" + first.contains("张三"));
        System.out.println("第二个集合大小：" + second.size());
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
