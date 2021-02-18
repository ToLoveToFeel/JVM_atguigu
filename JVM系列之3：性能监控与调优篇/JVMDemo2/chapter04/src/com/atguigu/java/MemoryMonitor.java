package com.atguigu.java;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * 监控我们的应用服务器的堆内存使用情况，设置一些阈值进行报警等处理
 *
 * @author shkstart
 * @create 15:23
 */
public class MemoryMonitor {
    public static void main(String[] args) {
        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
        System.out.println("INIT HEAP: " + usage.getInit() / 1024 / 1024 + "m");
        System.out.println("MAX HEAP: " + usage.getMax() / 1024 / 1024 + "m");
        System.out.println("USE HEAP: " + usage.getUsed() / 1024 / 1024 + "m");
        System.out.println("\nFull Information:");
        System.out.println("Heap Memory Usage: " + memorymbean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage: " + memorymbean.getNonHeapMemoryUsage());

        System.out.println("=======================通过java来获取相关系统状态============================ ");
        System.out.println("当前堆内存大小totalMemory " + (int) Runtime.getRuntime().totalMemory() / 1024 / 1024 + "m");// 当前堆内存大小
        System.out.println("空闲堆内存大小freeMemory " + (int) Runtime.getRuntime().freeMemory() / 1024 / 1024 + "m");// 空闲堆内存大小
        System.out.println("最大可用总堆内存maxMemory " + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "m");// 最大可用总堆内存大小
    }
}
/*
 INIT HEAP: 256m
 MAX HEAP: 3614m
 USE HEAP: 5m

 Full Information:
 Heap Memory Usage: init = 268435456(262144K) used = 5383480(5257K) committed = 257425408(251392K) max = 3790077952(3701248K)
 Non-Heap Memory Usage: init = 2555904(2496K) used = 4789360(4677K) committed = 8060928(7872K) max = -1(-1K)
 =======================通过java来获取相关系统状态============================
 当前堆内存大小totalMemory 245m
 空闲堆内存大小freeMemory 240m
 最大可用总堆内存maxMemory 3614m
 */