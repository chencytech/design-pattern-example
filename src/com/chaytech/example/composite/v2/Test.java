package com.chaytech.example.composite.v2;


/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:35
 */
public class Test {
    public static void main(String[] args) {
        IFileComponent file1 = new File("1.txt");
        IFileComponent file2 = new File("2.txt");
        IFileComponent file3 = new File("3.txt");
        IFileComponent file4 = new File("4.txt");

        Folder folder = new Folder("我的收藏");
        IFileComponent file5 = new File("hello.txt");
        IFileComponent file6 = new File("word.txt");
        folder.add(file5);
        folder.add(file6);
        Folder folder2 = new Folder("文本文档");
        folder2.add(file2);
        folder2.add(file3);
        folder2.add(file4);
        folder.add(folder2);

        file1.printName();

        folder.printName();
    }
}
