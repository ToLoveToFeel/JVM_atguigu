package com.atguigu.java;

/**
 * @author shkstart
 * @create 2020-09-13 10:50
 * <p>
 * 过程二：链接阶段
 * <p>
 * 基本数据类型：非 final 修饰的变量，在准备环节进行默认初始化赋值。
 *             final修饰以后，在准备环节直接进行显示赋值。
 * <p>
 * 拓展：如果使用字面量的方式定义一个字符串的常量的话，也是在准备环节直接进行显示赋值。
 */
public class LinkingTest {
    private static long id;  //
    private static final int num = 1;  //

    public static final String constStr = "CONST";
//    public static final String constStr1 = new String("CONST");

    public Object getObj() {
        return null;
    }

    public void print1() {
        System.out.println("hello");
    }
}
