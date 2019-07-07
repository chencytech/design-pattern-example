package com.chaytech.example.composite.v1;

/**
 * 文件叶子节点
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:27
 */
public class File extends AbstractFileComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("文件名称：" + name);
    }
}
