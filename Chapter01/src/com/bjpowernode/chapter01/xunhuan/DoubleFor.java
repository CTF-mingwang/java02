package com.bjpowernode.chapter01.xunhuan;

/**
 * 打印菱形
 *    *			外层循环控制行		内层循环控制列
 *   ***		空格:2 - i		*号2 * i
 *  *****
 * *******
 * 
 *  *****
 *   ***
 *    *
 * @author 小强
 * 2019年11月15日
 */
public class DoubleFor {
	public static void xunHuan() {
		//声明一个char类型的数
		char ch = 'A';
		//外层循环控制行号
		for (int i = 0; i < 4; i++) {
			//内层循环控制列
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			//内层循环控制列
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4 - 2 * i; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
	
	public static void XH() {
		//声明一个char类型的数
		char ch = 'A';
		//外层循环控制行号
		for (int i = 0; i < 4; i++) {
			//内层循环控制列
			for (int j = 0; j <= 2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print(ch);
				} else {
					System.out.print(" ");
				}
			}
			ch++;
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			//内层循环控制列
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4 - 2 * i; j++) {
				if (j == 0 || j == 4 -2 * i) {
					System.out.print(ch);
				} else {
					System.out.print(" ");
				}
			}
			ch++;
			System.out.println();
		}
	}
}
