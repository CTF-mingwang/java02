package com.bjpowernode.chapter01.xunhuan;

import java.util.Scanner;

public class RunYuan {

	public static void rLi() {
		//扫描器，监控用户录入信息
        Scanner input = new Scanner(System.in);
        //定义变量：年、月、天数
        int year = -1, month = -1, dayOfMonth = -1; //初始值去不冲突的值
        //定义接收用户输入内容的变量
        System.out.print("年份：");
        year = input.nextInt();
        System.out.print("月份：");
        month = input.nextInt();

        //根据月份计算计算当月的天数
        switch (month) {
            //2月默认初始值设为28
            case 2:
                dayOfMonth = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            default:
                System.err.println("数据输入错误，只能输入：1 - 12 之间的整形数字！！！");
                System.exit(0);
        }
        //如果输入的月份是闰年，月份天数+1
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
            dayOfMonth++;
        }
        System.out.print(year + "年" + month + "月有" + dayOfMonth + "天");
        System.out.println("日历如下：");
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		System.out.print("\t");
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i);
			if ((i + 1) % 7 == 0) {
				System.out.print("\n");	
			} else {
				System.out.print("\t");
			}	
		}
	}
}
