package com.bjpowernode.chapter01.jichuzongjie;

import java.util.Scanner;

/**
 * 使用方法实现月历的打印
 * @author 小强
 * @param
 * 2019年11月29日
 */
public class PrintCalender {
	/** 用户输入的年份 */
	public static int year = Integer.MIN_VALUE;
	/** 用户输入的月份 */
	public static int month = Integer.MIN_VALUE;
	/** 对应每个月份的天数 */
	private static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	/**
	 * 程序的主入口
	 * @param args
	 */
	public static void main(String[] args) {
		printCalendar();
//		getSumDayOfYears();
	}
	/**
	 * 打印月历的核心方法
	 */
	public static void printCalendar() {
		//1、让用户输入年份和月份
		inputYearAngMonth();
		//2、计算1900-1-1到用户输入年份的总天数（例：year = 2017,month = 7  2017-7-1）
		//	2-1. 计算各年的总天数
		//	2-2.计算各月的天数之和
		int sum = getSumDayOfYears();
		sum += getSumDayOfMonth();
		sum++;	//加上这句话，符合我们中国的日历，不加则类似于日本那种星期日在最后的逻辑
		//3、打印年份和月份（英文）
		//	 打印月份的标题（星期一到星期日）
		printMonthTitle();
		//5、根据某月1日星期几，打印月历的内容
		printCalendarContent(sum % 7);
	}
	
	/**
	 * 根据当月1号是周几打印月历的内容
	 * @param dayOfWeek	当月一号是星期几
	 */
	private static void printCalendarContent(int dayOfWeek) {
		//注意：dayOfWeek取值范围是0-6
		int sepCount = 0;	//\t的数量
		if (dayOfWeek == 0) {
			sepCount = 6;
		} else {
			sepCount = dayOfWeek - 1;
		}
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < dayOfMonth[month - 1]; i++) {
			System.out.print(i + 1);
			if ((dayOfWeek + i) % 7 == 0) {
				//周日
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
	
	/**
	 * 打印框架
	 */
	private static void printMonthTitle() {
		String[] monthNames = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		System.out.println("\t\t" + year + "\t" + monthNames[month-1]);
		String[] weekDays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		for (int i = 0; i < weekDays.length; i++) {
			System.out.print(weekDays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 获得1900-year年的总天数
	 * @return
	 */
	private static int getSumDayOfYears() {	//如果year是局部变量就要传参，全局变量可以不用传
		//判断用户是否已经输入了年份
		if (year == Integer.MIN_VALUE) {
			System.out.println("年份错误！请重新输入年份和月份！！！");
			inputYearAngMonth();
		}
		int sum = 0;
		for (int i = 1900; i < year; i++) {
			sum += 365;		//每一年累加365天
			if (isLeapYear(i)) {
				sum++;	//闰年多+1天
			}
		}
		return sum;
	}
	
	/**
	 * 得到year年1月1号到year年month-1月最后一天的总天数
	 * @return
	 */
	private static int getSumDayOfMonth() {
		int sum = 0;
		for (int i = 0; i < month -1; i++) {
			sum += dayOfMonth[i];
		}
		//如果year年是闰年，并且month >= 3
		if (isLeapYear(year) && month >= 3) {
			sum++;
		}
		return sum;
	}
	
	/**
	 * 用来判断传入的year变量是不是闰年
	 * @param year	要判断的年份
	 * @return	是闰年，返回true
	 */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 == 0 && year % 100 !=0;	//先算与关系，再算或关系
	}
	
	/**
	 * 接收用户输入的年份和月份
	 */
	private static void inputYearAngMonth() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		year = input.nextInt();
		System.out.print("请输入月份：");
		month = input.nextInt();
		//为了更专业一点，我们用完把input销毁了，可以俭省资源
		input.close();	//关闭new的对象，因为我们后面就不需要输入了
		input = null;	//关闭后销毁
	}

}










