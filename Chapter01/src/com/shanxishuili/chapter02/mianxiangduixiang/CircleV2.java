package com.shanxishuili.chapter02.mianxiangduixiang;

import java.util.Scanner;

/**
 * 			通过重载构造方法实现
 * 使用面向对象的方式创建一个圆类，分别计算周长和面积
 	1、定义类：Circle
 	2、抽取属性
 	3、定义方法
 	4、调用方法并打印结果
 * @author 小强
 * @date 2019年12月1日
 */
public class CircleV2 {
	/** 圆的半径 */
	public double radius;
	/** 圆的周长 */
	public double perimeter;
	/** 圆的面积 */
	public double arrea;
	

	/** 版本二 */
	public CircleV2() {
		inputRaius();
	}
	
	public CircleV2(double radius1) {
		if (radius1 > 0) {
			radius = radius1;
		} else {
			inputRaius();
		}
	}
	
	/**
	 * 输入圆的半径
	 */
	private void inputRaius() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		radius = input.nextDouble();
		input.close();
		input = null;
	}
	
	/**
	 * 打印圆的周长
	 */
	public void showPerimeter() {
		if (radius <= 0) {
			inputRaius();//如果用户没有输入半径，那么强制用户输入半径
		}
		perimeter = 2 * Math.PI * radius;//Math.PI 是数学里Π == 3.141592657--》是一个无限趋近的值
		System.out.println("圆的周长为：" + perimeter);
	}
	/**
	 * 打印圆的面积
	 */
	public void showArea() {
		if (radius <= 0) {
			inputRaius();//强制用户输入半径
		}
		arrea = Math.PI * Math.pow(radius, 2);
		System.out.println("圆的面积为：" + arrea);
	}
}
