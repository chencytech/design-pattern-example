package com.chaytech.example.builder.v2;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/06/04 22:09
 */
public class Person {
    private String name;
    private String age;
    private String sex;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static final class Builder {
        private String name;
        private String age;
        private String sex;

        public Builder() {}

        public Builder name(String val) {
            name = val;
            return this;
        }
        public Builder age(String val) {
            age = val;
            return this;
        }
        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Person build() {
            return new  Person(this);
        }
    }
}


