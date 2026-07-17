package com.study.p028;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 28 题：浏览器历史记录
 *
 * 题目摘要：
 * 使用 LinkedList<String> 模拟浏览器历史记录。
 * 要求：
 * - 访问新页面。
 * - 后退到上一个页面。
 * - 查看当前页面。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 28 题 ======");
        System.out.println("题目：浏览器历史记录");
        System.out.println("说明：使用 LinkedList<String> 模拟浏览器历史记录。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
    	LinkedList<String> history = new LinkedList<>();

        history.add("首页");

        System.out.println("当前浏览记录：" + history);

        solve(history);
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(LinkedList<String> history) throws Exception {
    	history.addLast("百度");
        System.out.println("访问新页面：百度");
        System.out.println("当前页面：" + history.getLast());

        history.addLast("哔哩哔哩");
        System.out.println("访问新页面：哔哩哔哩");
        System.out.println("当前页面：" + history.getLast());

        history.addLast("GitHub");
        System.out.println("访问新页面：GitHub");
        System.out.println("当前页面：" + history.getLast());

        System.out.println("全部历史记录：" + history);

        if (history.size() > 1) {
            String closedPage = history.removeLast();

            System.out.println("离开页面：" + closedPage);
            System.out.println("后退后的当前页面：" + history.getLast());
        } else {
            System.out.println("已经是第一个页面，无法继续后退。");
        }

        System.out.println("后退后的历史记录：" + history);
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
