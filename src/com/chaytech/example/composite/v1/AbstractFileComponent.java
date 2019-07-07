package com.chaytech.example.composite.v1;

import java.util.List;

/**
 * 文件抽象构建
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/26 22:18
 */
public abstract class AbstractFileComponent {

    public abstract void printName();

    /**
     * 增加一个节点
     *
     * @param file
     */
    public void add(AbstractFileComponent file){
        /**
         * 缺省实现，抛出异常，因为叶子对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    /**
     * 移除一个节点
     *
     * @param index
     */
    public void remove(int index){
        /**
         * 缺省实现，抛出异常，因为叶子对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public List<AbstractFileComponent> getChild(){
        /**
         * 缺省实现，抛出异常，因为叶子对象没有此功能
         * 或者子组件没有实现这个功能
         */
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
