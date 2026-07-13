package com.study.p009;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 9 题：集合保存学生姓名
 *
 * 题目摘要：
 * 使用 ArrayList<String> 保存 5 个学生姓名。
 * 要求：
 * - 添加姓名。
 * - 删除一个姓名。
 * - 修改一个姓名。
 * - 遍历输出所有姓名。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 9 题 ======");
        System.out.println("题目：集合保存学生姓名");
        System.out.println("说明：使用 ArrayList<String> 保存 5 个学生姓名。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        List<String> students = new ArrayList<>();
        students.add("张三");
        students.add("李四");
        students.add("王五");
        students.add("赵六");
        students.add("钱七");

        System.out.println("原始学生名单：" + students);

        solve(students);
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(List<String>students) throws Exception {
    	students.add("孙八");
    	System.out.println("当前学生名单：" + students);
    	students.remove(0);
    	System.out.println("当前学生名单：" + students);
    	students.set(3, "N/A");
    	System.out.println("当前学生名单：" + students);
        
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
