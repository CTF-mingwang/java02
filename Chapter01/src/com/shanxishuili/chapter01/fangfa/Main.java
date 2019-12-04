package com.shanxishuili.chapter01.fangfa;

import java.util.Scanner;

/**
 * 
 * @author 小强
 * 2019年11月27日
 */
public class Main {

	public static void main(String[] args) {
		
		budingchang("小王", 12,12,23,34,45,656,67,34);
		
		//1、让用户输入一个10进制数
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整型数字：");
		int decNum = input.nextInt();
		//2、调用方法将10进制转为16进制
		System.out.println(JingZhiZhuanHua.decToHex(decNum));
		//3、再将16进制数字转换回10进制
		System.out.println(JingZhiZhuanHua.hexToDec(JingZhiZhuanHua.decToHex(decNum))); //方法调方法，实际开发中不会这么干

		
//		String words1 = "王婧琦";
//		String words2 = "你好";
//		String words3 = "吗？";	
//		LeiKu.printWords(3, words1);
//		LeiKu.printWords(2, words2);
//		LeiKu.printWords(1, words3);
		
//		LeiKu.shanJiao();
		
//		int num1 = 20;
//		int num2 = 30;
//		int sum = LeiKu.getSum(num1,num2);
//		System.out.println(sum);
		
//		System.out.print("请输入1-7之间的星期：");
//		int xingQi = new Scanner(System.in).nextInt();
//		LeiKu.china(xingQi - 1);
//		LeiKu.rb(xingQi - 1);
//		LeiKu.mg(xingQi - 1);
		
		//班里讲的异常
//		LeiKu.yiChang(1);
		
		//喊话
//		LeiKu.SendMessage("王五", "艾欧尼亚", "独孤求败", 5, 1);
		//使用方法重载
//		LeiKu.SendMessage("小红");
		
	}
	
	public static void budingchang(String name,int... age) {
		for (int i = 0; i < age.length; i++) {
			System.out.println("姓名：" + name + (i + 1) + "--->>>" + age[i]);
		}
	}

}
