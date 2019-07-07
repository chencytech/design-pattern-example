package com.chaytech.example.composite.v1;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:35
 */
public class Test {
    public static void main(String[] args) {
        AbstractFileComponent file1 = new File("1.txt");
        AbstractFileComponent file2 = new File("2.txt");
        AbstractFileComponent file3 = new File("3.txt");
        AbstractFileComponent file4 = new File("4.txt");

        AbstractFileComponent folder = new Folder("我的收藏");
        AbstractFileComponent file5 = new File("hello.txt");
        AbstractFileComponent file6 = new File("word.txt");
        folder.add(file5);
        folder.add(file6);
        AbstractFileComponent folder2 = new Folder("文本文档");
        folder2.add(file2);
        folder2.add(file3);
        folder2.add(file4);
        folder.add(folder2);

        file1.printName();

        folder.printName();
    }
}
