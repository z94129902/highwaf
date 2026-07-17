package com.study.p029;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * 第 29 题：音乐播放列表
 *
 * 题目摘要：
 * 使用 LinkedList<String> 保存歌曲列表。
 * 要求：
 * - 添加歌曲。
 * - 删除歌曲。
 * - 下一首。
 * - 上一首。
 *
 * 使用方式：
 * 1. 先运行 main 方法查看示例输出。
 * 2. 根据 TODO 完成 solve 方法或补充代码。
 * 3. 通过控制台输入输出验证自己的实现。
 */
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("====== Java 高级练习 第 29 题 ======");
        System.out.println("题目：音乐播放列表");
        System.out.println("说明：使用 LinkedList<String> 保存歌曲列表。");
        System.out.println();
        run();
    }

    private static void run() throws Exception {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("晴天");
        playlist.add("七里香");
        playlist.add("稻香");

        System.out.println("当前播放列表：" + playlist);

        solve(playlist);
    }

    /**
     * 模拟添加歌曲、删除歌曲、下一首和上一首。
     */
    private static void solve(LinkedList<String> playlist) throws Exception {
        if (playlist.isEmpty()) {
            System.out.println("播放列表为空。");
            return;
        }

        int currentIndex = 0;

        System.out.println("当前播放：" + playlist.get(currentIndex));

        playlist.add("夜曲");
        System.out.println("添加歌曲《夜曲》后：" + playlist);

        if (currentIndex < playlist.size() - 1) {
            currentIndex++;
            System.out.println("下一首：" + playlist.get(currentIndex));
        } else {
            System.out.println("已经是最后一首歌曲。");
        }

        if (currentIndex < playlist.size() - 1) {
            currentIndex++;
            System.out.println("下一首：" + playlist.get(currentIndex));
        } else {
            System.out.println("已经是最后一首歌曲。");
        }

        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("上一首：" + playlist.get(currentIndex));
        } else {
            System.out.println("已经是第一首歌曲。");
        }

        String deletedSong = "七里香";

        int deletedIndex = playlist.indexOf(deletedSong);

        if (deletedIndex != -1) {
            playlist.remove(deletedSong);

           
            if (deletedIndex < currentIndex) {
                currentIndex--;
            }

            if (currentIndex >= playlist.size()) {
                currentIndex = playlist.size() - 1;
            }

            System.out.println("删除歌曲《" + deletedSong + "》后：" + playlist);
        } else {
            System.out.println("播放列表中没有歌曲《" + deletedSong + "》。");
        }

        if (!playlist.isEmpty()) {
            System.out.println("当前播放：" + playlist.get(currentIndex));
        } else {
            System.out.println("播放列表为空。");
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
