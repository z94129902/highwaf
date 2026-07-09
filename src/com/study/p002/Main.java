package com.study.p002;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 2 题：数组元素反转
 *
 * 题目摘要：
 * 定义一个字符串数组，例如：{\"Java\", \"Python\", \"Go\", \"C++\"}，将数组内容原地反转。
 * 要求：
 * - 不能创建第二个数组保存结果。
 * - 输出反转前和反转后的数组。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 2 题 ======");
        System.out.println("题目：数组元素反转");
        System.out.println("说明：定义一个字符串数组，例如：{\"Java\", \"Python\", \"Go\", \"C++\"}，将数组内容原地反转。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
    	String[] languages = {"Java", "Python", "Go", "C++"};
    	System.out.println("反转前：" + Arrays.toString(languages));
        solve(languages);
        System.out.println("反转后：" + Arrays.toString(languages));
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(String[] languages) throws Exception {
    	for(int i = 0; i < languages.length/2; i ++) {
    		int j = languages.length - 1 - i;
            String temp = languages[i];
            languages[i] = languages[j];
            languages[j] = temp;
    	}
        System.out.println("TODO：请在 solve() 方法中完成本题核心逻辑。");
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
