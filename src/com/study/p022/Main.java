package com.study.p022;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 22 题：ArrayList 分页查询
 *
 * 题目摘要：
 * 使用 ArrayList<String> 保存 30 条数据。
 * 要求：
 * - 用户输入页码和每页条数。
 * - 输出对应页的数据。
 * - 处理页码非法情况。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 22 题 ======");
        System.out.println("题目：ArrayList 分页查询");
        System.out.println("说明：使用 ArrayList<String> 保存 30 条数据。");
        System.out.println();
        run();
    }

    private static void run() {
        List<String> dataList = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            dataList.add("数据" + i);
        }

        System.out.println("全部数据：" + dataList);

        solve(dataList);
    }

    private static void solve(List<String> dataList) {
        int pageNumber = readInt("请输入页码：");
        int pageSize = readInt("请输入每页条数：");

        if (pageNumber <= 0) {
            System.out.println("页码必须大于 0。");
            return;
        }

        if (pageSize <= 0) {
            System.out.println("每页条数必须大于 0。");
            return;
        }

        int totalPages =
                (dataList.size() + pageSize - 1) / pageSize;

        if (pageNumber > totalPages) {
            System.out.println("页码不存在。");
            System.out.println("总页数是：" + totalPages);
            return;
        }

        int startIndex = (pageNumber - 1) * pageSize;
        int endIndex = startIndex + pageSize;

        if (endIndex > dataList.size()) {
            endIndex = dataList.size();
        }

        System.out.println();
        System.out.println("第 " + pageNumber + " 页的数据：");

        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(dataList.get(i));
        }

        System.out.println("当前页：" + pageNumber);
        System.out.println("每页条数：" + pageSize);
        System.out.println("总页数：" + totalPages);
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
