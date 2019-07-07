package com.chaytech.example.composite.v2;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:49
 */
public class File implements IFileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("文件名称：" + name);
    }
}
