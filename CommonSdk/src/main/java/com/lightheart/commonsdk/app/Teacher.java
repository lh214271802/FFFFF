package com.lightheart.commonsdk.app;

/**
 * @author LiaoHui
 * @date 2018/8/9
 * @desc
 */
public class Teacher {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age + "-->hashCode=" +
                hashCode() +
                '}';
    }
}
