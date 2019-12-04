package com.bjpowernode.chapter01.xunhuan;

import java.util.Scanner;

public class SuiJi {

	public static void youXi() {
		//声明一个随机常量,用户要猜的数
		final int price = (((int)(Math.random() * 1000)) % 9 + 1) * 1000;	//把随机数控制为1000-9000之间的常量
		System.out.println(price);
		//用户猜测的单价
		int guessprice = -1;
		//用户猜测的总次数
		int count = 0;
		//商品的名称
		String prizeNameString = null;
		//用户猜的次数
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价：(" + ++count + "次)");
			//用户猜测的单价
			guessprice = new Scanner(System.in).nextInt();	//匿名调用方法
			if (guessprice == price) {	//在猜测正确的情况下，判断猜测的次数
				if (count == 1) {
					System.out.println("牛逼！一次就猜对了！");
					prizeNameString = "iPhone6sp";
				} else if(count >= 2 && count <= 3) {
					prizeNameString = "华为手环";
				} else {
					prizeNameString = "小米蓝牙耳机";
				}
				break;
			} else if(guessprice < price) {
				System.out.println("小了！请继续！");
			} else if(guessprice > price) {
				System.out.println("大了！请继续！");
			}
		}
		if (null == prizeNameString) {
			System.err.println("很遗憾！五次机会已用完，期待下次吧！");
		} else {
			System.out.println("恭喜，你中奖了，奖品是：" + prizeNameString);
		}
	}

}
