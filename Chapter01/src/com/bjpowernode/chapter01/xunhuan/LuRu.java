package com.bjpowernode.chapter01.xunhuan;

import java.util.Scanner;

/**
 * 循环输入五个玩家的消费，统计消费额低于500的玩家数量
 * 如果消费大于等于500，则跳过，小于500则计数器+1
 * @author 小强
 * 2019年11月14日
 */
public class LuRu {
	public static void XunHuan() {
		double money = Double.MAX_VALUE;	//玩家输入的金额,一般初值给定一个取不到的值,方便后面判断
		int jia = 0;	//计数器
		for(int i = 1; i <= 5; i++) {
			System.out.printf("请输入玩家【%d】的消费额度：",i);
			money = new Scanner(System.in).nextDouble();	//匿名调用方法
			if (money >= 500)	//条件判断
				continue;	//跳出当前内容，循环下一个内容
			jia++;	//计数器
		}
		System.out.printf("消费额度低于500的玩家有: %d 个",jia);
	}
}
