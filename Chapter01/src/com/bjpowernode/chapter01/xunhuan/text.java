package com.bjpowernode.chapter01.xunhuan;

import java.util.Scanner;
/**
 * @author 小强
 * 2019年11月14日
 */
public class text {
	public static void lianXi() {
		/*
		 * 统计玩家的个人贡献度，遇到负数，跳出循环
		 */
		 int exp = 0;	//个人贡献度
		 int sum = 0;	//总贡献度
		 for (;;) {	//死循环
			 System.out.print("请输入个人贡献度：");
			 exp =new Scanner(System.in).nextInt();	//使用匿名调用对象方法
			 //条件判断
			 if (exp < 0) {
				System.err.println("个人贡献度不能为零，程序强制退出！！！");
				break;	//跳出
			}
			 sum += exp;	//累加求和
		 }
		 System.out.println("总贡献度是：" + sum);
	}
	
	public static void Text() {
		int count =0;
		long starTime = System.currentTimeMillis();	//从1970-1-1到现在的毫秒数
		while(true) {	//死循环
			if(++count == Integer.MAX_VALUE) {	//整形的最大值
				break;	//跳出循环
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("循环以结束" + count);
		System.out.println("循环已用时：" + (endTime - starTime) + "毫秒。");
	}
}
