package com.shanxishuili.chapter02.mianxiangduixiang;

/**
 * 			使用封装
 * 使用面向对象的方式创建一个圆类，分别计算周长和面积
 	1、定义类：Circle
 	2、抽取属性
 	3、定义方法
 	4、调用方法并打印结果
 * @author 小强
 * @date 2019年12月1日
 */
public class CircleV3 {
	/** 圆的半径 */
	private double radius;
	/** 圆的周长 */
	private double perimeter;
	/** 圆的面积 */
	private double arrea;
	
	//半径可读
	public double getRadius() {
		return radius;
	}
	//可以修改
	public void setRadius(double radius) {
		if (radius <= 0) {//分装的好处：可以对传入的属性进行简单的验证
			radius = 1;
		} else {
			//this -> 自指针	朕/寡人
			this.radius = radius;
		}
	}
	
	//默认构造
	public CircleV3() {}
	//带参构造
	public CircleV3(double radius) {
//			this.radius = radius;
		this.setRadius(radius);	//把属性和方法分门别类的分装在类里
	}

	//计算周长
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;//Math.PI 是数学里Π == 3.141592657--》是一个无限趋近的值
		return perimeter;
	}
	//计算面积
	public double getArrea() {
		arrea = Math.PI * Math.pow(radius, 2);
		return arrea;
	}
	
	//打印
	public void show() {
		System.out.println("周长是：" + this.getPerimeter());
		System.out.println("面积是：" + this.getArrea());
	}
}
