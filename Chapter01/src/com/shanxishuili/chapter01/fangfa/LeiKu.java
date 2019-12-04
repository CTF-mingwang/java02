package com.shanxishuili.chapter01.fangfa;

import java.sql.Time;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class LeiKu {
	
	/*
	 * 内置方法(部分)：
	 * -由JDK类库提供
	 * -需要导入相应的包
	 * java.long.*
	 * 		System.out				输出
	 * 		System.in				输入
	 * 		System.exit();			退出程序
	 * 		Math.random();			随机数
	 * 		Integer.parseInt(); 	数据类型转换
	 * java.util.*
	 * 		Calendar.getInstance();
	 * 		Arrays.sort();
	 * 		Collections.binarySearch();
	 * javax.swing.*
	 * 		JOptionPane.showMessageDialog();
	 * 
	 * 自定义方法：
	 * -带参数
	 * -不带参数
	 */
	
	public static void printWords(int times,String words) {
		for (int i = 0; i < times; i++) {
			System.out.println(words);
		}
		
	}
	
/**
 * 要求根据用户输入的三个角的顶点坐标计算三个角值（非弧度）
	1、两点之间距离公式：√([(x2-x1)] ^2 + [(y2-y1)] ^2)
 	2、可以通过以下公式计算角度(弧度)：
	A = acos((a * a - b * b - c * c) / (-2 * b * c))
	B = acos((b * b - b * b - c * c) / (-2 * a * c))
	C = acos((c * c - b * b - a * a) / (-2 * b * a))
 */
	public static void shanJiao() {
		//1、设置三个顶点的坐标
		int x1 = 90,y1 = 180;
		int x2 = 205,y2 = 89;
		int x3 = 310,y3 = 240;
		//2、根据公式计算出三条边的边长
		double a = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
		//3、根据公式计算三个角的弧度
		double radiansA = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double radiansB = Math.acos((b * b - b * b - c * c) / (-2 * a * c));
		double radiansC = Math.acos((c * c - b * b - a * a) / (-2 * b * a));
		//4、将弧度转换为度
		double degreeA = Math.toDegrees(radiansA);
		double degreeB = Math.toDegrees(radiansB);
		double degreeC = Math.toDegrees(radiansC);
	}
	
	public static int getSum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/**
	 * 用来判断传入的参数是否在1-7之间
	 * @param xingQi 要判断整形数字，星期几
	 * @return	如果合法：返回true,非法：返回false
	 */
	private static boolean isPanDuan(int xingQi) {
		//判断的是数组的下标，而不是数组里的内容，所以要按数组的顺序判断
		if (xingQi < 0 || xingQi > 6) {
			return false;
		}
		return true;
	}
	
	/**
	 * 打印中国星期
	 * @param xingQi 汉字
	 */
	static void china(int xingQi) {
		if (!isPanDuan(xingQi)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] xq = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println("中国：" + xq[xingQi]);
	}
	
	/**
	 * 打印日本星期
	 * @param xingQi 日语
	 */
	static void rb(int xingQi) {
		if (!isPanDuan(xingQi)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] xq = {"星曜日","金曜日","木曜日","水曜日","火曜日","土曜日","日曜日"};
		System.out.println("日本：" + xq[xingQi]);
	}
	
	/**
	 * 打印美国星期
	 * @param xiangQi
	 */
	static void mg(int xingQi) {
		if (!isPanDuan(xingQi)) {
			System.out.println("必须输入1-7之间的数");
			return;
		}
		String[] xq = {"one","two","three","for","five","six","seven"};
		System.out.println("美国：" + xq[xingQi]);
	}
	
	/**
	 * 捕获异常
	 */
	public static void yiChang(int aaa) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
//		try {
//			System.out.println(list.get(5));
//			ArrayList<Integer> list2 = new ArrayList<Integer>(-1);
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("捕获集合越界异常");
//				}catch (IllegalArgumentException e) {
//					System.out.println("捕获非法参数异常");
//				}
		
		try {
			System.out.println(list.get(5));
		} catch (IndexOutOfBoundsException e) {
			for (int i = 0; i < 1000; i++) {
				System.out.println("捕获异常" + i);
				try {
					Thread.sleep(aaa * 1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	
	public static void SendMessage(String newName) {
		String[] ghString = {
			"你好吗？",
			"你是？"
		};
		SendMessage(newName, "德玛西亚", ghString[(int)(Math.random() * 2)], 5, 1);
	}
	
	/**
	 * 实现游戏喊话功能
	 * @param name	名字
	 * @param channelName	喊话频道
	 * @param message	喊话内容
	 * @param count	喊话次数
	 * @param interval	喊话的时间间隔（单位：秒）
	 */
	public static void SendMessage(String name, String channelName, String message, int count, int interval) {
		//判断变量的合法性
//		if (interval < 5) interval = 5;
		//喊话的总体逻辑，字符串拼接后打印输出
		String value = String.format("【%s】  %s: %s", 
				name,channelName,message
		);
		for (int i = 0; i < count; i++) {
			System.out.println(value);
			try {
//				Thread.sleep(interval * 1000);	//休眠多少秒
				//专业写法 
				TimeUnit.SECONDS.sleep(interval);	//休眠多少秒
//				TimeUnit.HOURS.sleep(interval); 	//休眠多少小时
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		//喊一次话元宝-10
	}
}












