package com.bjpowernode.chapter01.xunhuan;
/**
 * 使用for循环打印日历
 * @author 小强
 * 2019年11月14日
 */
public class rLi {
	public static void daYing() {
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		System.out.print("\t");
		for (int i = 1; i <= 31; i++) {
			System.out.print(i);
			if ((i + 1) % 7 == 0) {
				System.out.print("\n");	
			} else {
				System.out.print("\t");
			}
		}
	}
}
