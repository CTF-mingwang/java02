package com.bjpowernode.chapter01.xunhuan;
/**
 *操场上有100多人排队，三人一组多一人，四人一组多两人，五人一组多三人。问：一共有多少人排队？
 * @author 小强
 * 2019年11月17日
 */
public class PeiDui {
	public static void ren() {
		//100多人--最少100人--最多不会超过200人
		for (int i = 100; i < 200; i++) {
			if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3) {
				System.out.printf("一共有%d人排队！！！\n",i);
			} else {
				continue;
			}
		}
	}
	
/**
 * 甲乙丙丁一共加工零件370个，如果把甲做的个数加10，乙做的个数-20，丙做的个数乘以2，
 * 丁做的个数除以2，那么四人做的零件数相等，问：甲做了多少个零件？
 * 这里我们使用 穷举法
 */
	public static void LingJie() {
		for (int j = 1; j < 367; j++) {	//甲的零件个数				
			for (int y = 1; y < 367; y++) {	//乙的零件个数
				for (int b = 1; b < 367; b++) {	//丙的零件个数
					int d = 370 - j - y - b;	//丁的零件个数
					if(j + y + b + d ==370 && j + 10 == y - 20 && y - 20 == b * 2 && b * 2 == d / 2 && d / 2 == j + 10) {
						System.out.printf("四人加工的数量分别是：%-4d%-4d%-4d%-4d\n",j,y,b,d);
						System.out.println("甲做了：" + j + "个。");
					}
				}
			}
		}
	}
	
	/**
	 * 求1-500	之间不含数字4的自然数共有多少？
	 */
	public static void qiu4() {
		int count = 0;
		for (int i = 1; i <= 500; i++) {
			int g = i % 10;	//个位
			int s = i / 10 % 10;	//十位
			int b = i /100;	//百位
			if (g == 4 || s == 4 || b == 4) {
				continue;
			}else {
				count++;
			}		
		}
		System.out.println("不含4的自然数共有：" + count + "个。");
	}
	
	/**
	 * 两个自然数x、y相除，商3余10，被除数、除数、商、余数的和是163，求被除数、除数.（115、35）
	 */
	public static void XiangChu() {
		for (int x = 1; x <= 163; x++) {
			for (int y = 3; y <= x / 3; y++) {
				int mod = x % y;
				if (x + y + mod + x / y == 163 && x / y == 3&& x % y == 10 && mod == 10) {
					System.out.println(x + "\t" + y);
				}
			}
		}
	}
}







