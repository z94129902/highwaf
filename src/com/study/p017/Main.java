package com.study.p017;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 17 题：ArrayList 增删改查菜单
 *
 * 题目摘要：
 * 使用 ArrayList<String> 实现一个控制台菜单。
 * 要求：
 * - 添加商品。
 * - 删除商品。
 * - 修改商品。
 * - 查询全部商品。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 17 题 ======");
        System.out.println("题目：ArrayList 增删改查菜单");
        System.out.println("说明：使用 ArrayList<String> 实现一个控制台菜单。");
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
    	List<String> productList = new ArrayList<>();

        productList.add("苹果");
        productList.add("香蕉");
        productList.add("牛奶");
        while (true) {
            System.out.println();
            System.out.println("====== 商品管理菜单 ======");
            System.out.println("1. 添加商品");
            System.out.println("2. 删除商品");
            System.out.println("3. 修改商品");
            System.out.println("4. 查询全部商品");
            System.out.println("0. 退出程序");

            int choice = readInt("请选择操作：");

            if (choice == 1) {
                addProduct(productList);
            } else if (choice == 2) {
                deleteProduct(productList);
            } else if (choice == 3) {
                updateProduct(productList);
            } else if (choice == 4) {
                showProducts(productList);
            } else if (choice == 0) {
                System.out.println("程序已退出。");
                break;
            } else {
                System.out.println("没有这个选项，请重新输入。");
            }
        }
    }
    
    private static void addProduct(List<String> productList) {
    	String productName = readLine("请输入名称：");
    	productList.add(productName);
    }
    
    private static void deleteProduct(List<String> productList) {
    	int num = readInt("输入要删除的编号：");
    	if (num < 0 || num >= productList.size() - 1) {
            System.out.println("商品编号不存在。");
            return;
        }
    	productList.remove(num);
    }
    
    private static void updateProduct(List<String> productList) {
    	int number = readInt("请输入要修改的商品编号：");

        if (number < 0 || number >= productList.size()) {
            System.out.println("商品编号不存在。");
            return;
        }
        String newString = readLine("输入要改的：");
        productList.set(number, newString);
        System.out.println("改完后：" + productList );
    }
    
    private static void showProducts(List<String> productList) {
    	System.out.println("展示商品：" + productList );
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
