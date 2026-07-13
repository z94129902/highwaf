package com.study.p008;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 8 题：简单学生成绩表
 *
 * 题目摘要：
 * 使用二维数组保存 3 名学生的 3 门课程成绩。
 * 要求：
 * - 输出每个学生的总分和平均分。
 * - 输出每门课程的平均分。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 8 题 ======");
        System.out.println("题目：简单学生成绩表");
        System.out.println("说明：使用二维数组保存 3 名学生的 3 门课程成绩。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
    	int[][] scores = {
    	        {80, 90, 85},
    	        {70, 88, 92},
    	        {95, 86, 78}
    	    };

    	    solve(scores);
    }

    /**
     * TODO 学员主要完成区域。
     * 可以修改方法参数、返回值，也可以拆分更多小方法。
     */
    private static void solve(int[][] scores) throws Exception {
    	for(int i = 0; i < scores[i].length; i++) {
    		int sum = 0;
    		for(int j = 0; j< scores[i].length; j++) {
    			sum += scores[i][j];
    		}
    		System.out.println("第" + i + "个学生总分是" + sum + "平均分是" + sum/scores[i].length);
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
