package com.shanxishuili.chapter02.mianxiangduixiang;

import java.util.Scanner;

/**
 * 这是一个测试类
 * @author 小强
 * @date 2019年12月1日
 */
public class CircleText {

	public static void main(String[] args) {
//		//实例化-1
//		Circle circle = new Circle();
//		//调用
//		circle.inputRaius();
//		circle.showPerimeter();
//		circle.showArea();
		
//		//实例化-2
//		CircleV2 circle = new CircleV2();
//		//调用
//		circle.showPerimeter();
//		circle.showArea();
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		double radius = input.nextDouble();
		input.close();
		input = null;
		//实例化-3
		CircleV3 circle = new CircleV3(radius);
		//调用
		circle.show();
	}

}
