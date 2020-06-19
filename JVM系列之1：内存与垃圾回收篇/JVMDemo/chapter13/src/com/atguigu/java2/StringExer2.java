package com.atguigu.java2;

/**
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  20:26
 */
public class StringExer2 {
    public static void main(String[] args) {
        String s1 = new String("ab");  // 执行完以后，会在字符串常量池中会生成"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);  // jdk6/7/8：false
		
//        String s1 = new String("a") + new String("b");  // 执行完以后，不会在字符串常量池中会生成"ab"
//        s1.intern();
//        String s2 = "ab";
//        System.out.println(s1 == s2);  // jdk6：false		jdk7/8：true
    }
}
