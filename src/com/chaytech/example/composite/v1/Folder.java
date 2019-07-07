package com.chaytech.example.composite.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录树枝构建
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:28
 */
public class Folder extends AbstractFileComponent {
    private String name;
    // 内部节点集合，用于存放文件和文件夹
    private List<AbstractFileComponent> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFileComponent file){
        fileList.add(file);
    }

    public void remove(int index){
       fileList.remove(index);
    }

    public List<AbstractFileComponent> getChild(){
       return fileList;
    }

    @Override
    public void printName() {
        System.out.println("文件夹名称：" + name);
        for (AbstractFileComponent abstractFile : fileList) {
            abstractFile.printName();
        }
    }
}
