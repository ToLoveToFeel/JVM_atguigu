package com.atguigu.java;

import org.junit.Test;


/**
 * @author shkstart
 * @create 2020-09-08 0:11
 * -XX:+TraceClassLoading
 * <p>
 * 指令3：类型转换指令
 */
public class ClassCastTest {
    // 宽化类型转换

    // 针对于宽化类型转换的基本测试
    public void upCast1() {
        int i = 10;
        long l = i;  // i2l
        float f = i;  // i2f
        double d = i;  // i2d

        float f1 = l;  // l2f
        double d1 = l;  // l2d

        double d2 = f1;  // f2d
    }

    // 举例：精度损失的问题
    @Test
    public void upCast2() {
        int i = 123123123;
        float f = i;
        System.out.println(f);  // 123123120

        long l = 123123123123L;
        l = 123123123123123123L;
        double d = l;
        System.out.println(d);  // 123123123123123120
    }

    // 针对于byte、short等转换为容量大的类型时，将此类型看做int类型处理。
    public void upCast3(byte b) {
        int i = b;
        long l = b;  // i2l
        double d = b;  // i2d
    }

    public void upCast4(short s) {
        int i = s;
        long l = s;  // i2l
        float f = s;  // i2f
    }

    // 窄化类型转换
    // 基本的使用
    public void downCast1() {
        int i = 10;
        byte b = (byte) i;  // i2b
        short s = (short) i;  // i2s
        char c = (char) i;  // i2c

        long l = 10L;
        int i1 = (int) l;  // l2i
        byte b1 = (byte) l;  // l2i --> i2b
    }

    public void downCast2() {
        float f = 10;
        long l = (long) f;  // f2l
        int i = (int) f;  // f2i
        byte b = (byte) f;  // f2i --> i2b

        double d = 10;
        byte b1 = (byte) d;  // d2i --> i2b

    }

    public void downCast3() {
        short s = 10;
        byte b = (byte) s;  // i2b
    }

    //窄化类型转换的精度损失
    @Test
    public void downCast4() {
        int i = 128;
        byte b = (byte) i;
        System.out.println(b);  // -128
    }

    // 测试NaN,无穷大的情况
    @Test
    public void downCast5() {
        double d1 = Double.NaN;  // 0.0 / 0.0
        int i = (int) d1;
        System.out.println(d1);  // NaN
        System.out.println(i);  // 0

        double d2 = Double.POSITIVE_INFINITY;
        long l = (long) d2;
        int j = (int) d2;
        System.out.println(l);  // Long.MAX_VALUE
        System.out.println(j);  // Integer.MAX_VALUE

        float f = (float) d2;
        System.out.println(f);  // Infinity

        float f1 = (float) d1;
        System.out.println(f1);  // NaN
    }
}
