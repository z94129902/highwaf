package com.study.p003;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 3 题：模拟栈 Stack
 *
 * 题目摘要：
 * 使用数组模拟一个栈结构。
 * 要求：
 * - 支持 push 入栈。
 * - 支持 pop 出栈。
 * - 支持 peek 查看栈顶元素。
 * - 栈满或栈空时给出提示。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 3 题 ======");
        System.out.println("题目：模拟栈 Stack");
        System.out.println("说明：使用数组模拟一个栈结构。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        int[] numbers = {12, 5, 33, 8, 19, 21, 7, 40, 16, 3};
        System.out.println("示例数组：" + Arrays.toString(numbers));
        // TODO 学员实现：根据题目要求处理数组或二维数组。
        // 提示：优先使用 for 循环，先不要直接使用高级工具方法。
        solve();
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve() throws Exception {
        int[] stack = new int[3];
        int top = -1;

        // push 10
        if (top == stack.length - 1) {
            System.out.println("栈满了，不能入栈");
        } else {
            top++;
            stack[top] = 10;
            System.out.println("入栈：" + 10);
        }

        // push 20
        if (top == stack.length - 1) {
            System.out.println("栈满了，不能入栈");
        } else {
            top++;
            stack[top] = 20;
            System.out.println("入栈：" + 20);
        }

        // peek
        if (top == -1) {
            System.out.println("栈空了，没有栈顶元素");
        } else {
            System.out.println("栈顶元素：" + stack[top]);
        }

        // pop
        if (top == -1) {
            System.out.println("栈空了，不能出栈");
        } else {
            int value = stack[top];
            top--;
            System.out.println("出栈：" + value);
        }

        // peek
        if (top == -1) {
            System.out.println("栈空了，没有栈顶元素");
        } else {
            System.out.println("栈顶元素：" + stack[top]);
        }
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
