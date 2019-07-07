package com.chaytech.example.composite.v2;


import java.util.ArrayList;
import java.util.List;

/**
 * 目录树枝构建
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:28
 */
public class Folder implements IFileComponent {
    private String name;
    // 内部节点集合，用于存放文件和文件夹
    private List<IFileComponent> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(IFileComponent file){
        fileList.add(file);
    }

    public void remove(int index){
       fileList.remove(index);
    }

    public List<IFileComponent> getChild(){
       return fileList;
    }

    @Override
    public void printName() {
        System.out.println("文件夹名称：" + name);
        for (IFileComponent abstractFile : fileList) {
            abstractFile.printName();
        }
    }
}
