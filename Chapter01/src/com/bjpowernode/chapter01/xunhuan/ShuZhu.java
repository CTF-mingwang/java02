package com.bjpowernode.chapter01.xunhuan;
/**
 * 用户输入数组的内容
 * @author 小强
 * 2019年11月19日
 */

import java.util.Arrays;
import java.util.Scanner;

public class ShuZhu {
	public static void daYing() {
		Scanner input = new Scanner(System.in);
		//要求用户动态录入5个学生的成绩，求平均成绩
		//专业的写法
		final int N = 5;
		double[]  scores = new double[N];
		double sum = 0, avg;	//总成绩和平均值
		for (int i = 0; i < scores.length; i++) {
			//数组第一位是从0开始的，所以要显示第一位同学就需要+1
			System.out.print("请输入第" + (i + 1) + "位同学的成绩：");
			//将用户输入的double类型的数据，赋值给数组的第i个元素
			scores[i] = input.nextDouble();	//重点语句！！！
		}
		
		//一个循环最好只控制一种情况
		//计算总成绩
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];	//经典代码
		}
		System.out.printf("%d位同学的平均成绩为：%.2f\n总成绩是：%.2f", scores.length,sum / scores.length,sum);
	}
	
/**
 * 斐波那契数列
 */
	public static void HuangJingFengGeXian() {
		//0,1,1,2,3,5,8,13,21,34,55,89,144
		//前两个是初值，第三个元素开始，是前两个元素之和
		final int N = 20;
		int[] nums = new int[N];
		int sum = 0;	//求和
		double avg;	//平均数
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2; i < nums.length; i++) {	//第三个开始，是前两个数之和
			nums[i] = nums[i - 1] + nums[i - 2]; 
		}
		
		System.out.print("打印结果是：[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(",");
			}
			sum += nums[i];
		}
		System.out.println("]");
		System.out.println("总和是：" + sum);
		System.out.println("平均数是：" + sum / 1.0 / nums.length);
	}
	
	public static void jiZhi() {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]= ((int)(Math.random() * 1000)) % 1001;	//相当于随机生成0-1000的随机数 
		}
		
		//打印数组
		System.out.print("数组元素：【");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("】");
		
		//求数组中的最大值和最小值
		//1.假设第一个元素是最大值/最小值
		//2.拿最大值/最小值在数组中逐个比较，如果某个元素比max还大
//		int max = nums[0];
//		int min = nums[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				//you can you UP！
				max = nums[i];
			} else if (min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("数组中最大值是：" + max + "\n最小值是：" + min);
	}
	
	public static void jiOu() {
		//声明一个随机数组
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]= ((int)(Math.random() * 1000)) % 1001;	//相当于随机生成0-1000的随机数 
		}
		
		//打印数组
		System.out.print("数组元素：【");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("】");
		
		//判断数列奇偶的个数
		int count1 = 0, count2 = 0;	//奇数和偶数
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {	//偶数
				count1++;
			} else {	//奇数
				count2++;
			}
		}
		System.out.printf("偶数有：%d个，奇数有：%d个。",count1,count2);
	}
	
	public static void XiaBiao() {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]= ((int)(Math.random() * 1000)) % 1001;	//相当于随机生成0-1000的随机数 
		}
		
		//打印数组
		System.out.print("数组元素是：【");
		for(int i : nums) {
			System.out.print(i + ",");
		}
		System.out.println("】");
		
		//让用户输入要查找的数字
		//循环查找，遍历数组，查找对应的元素，如果找到了，打印下标，否则打印-1
		System.out.print("输入要查找的元素：");
		//匿名调用方法
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1;	//套路：一般要找下标，初值设为-1
		
		//循环查找
		for (int i = 0; i < nums.length; i++) {
			if(searchNum == nums[i]) {
				searchIndex = i;
				break;
			}
		}
		
		//在循环后判断
		if (searchIndex == -1) {
			System.out.println("很遗憾，没有这个元素！");
		} else {
			System.out.println("要查找的元素下标为：" + searchIndex);
		}
	}
	
	//赌圣洗牌
	//一副牌有13组牌面，4种花色
	public static void XiPai() {
		//定义数组
		final int N = 52;
		int[] cards = new int[N];	//52张牌
		
		//添加两个数组
		String[] cardColors = {"黑桃","红心","方块","梅花"};
		String[] cardValues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		//初始化牌面
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i; 	//牌面与循环变量的值一样，0-51之间
		}
		
		//洗牌前
		System.out.println("洗牌前：");
		for (int i = 0; i < cards.length; i++) {
//			System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
		
		//洗牌：随机生成一个0-51之间的数字newIndex,cards[i]和cards[newIngex]元素相交换
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random() * N);
			//开始交换
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		
		//洗牌后
		System.out.println("洗牌后：");
		for (int i = 0; i < cards.length; i++) {
//			System.out.print(cards[i]);
			System.out.printf("%s-%s", cardColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			} else {
				System.out.print("\t");
			}
		}
	}
	
	//比较数组元素大小
	public static void BiJiao() {
		//声明数组
//		int[] array = {123,343,45,23,56,345,345};
		
		//声明一个随机数组
		final int N = 5000;
		int[] array = new int[N];	//第一个数组
		int[] array2 = new int[N];	//第二个数组
		int[] array3 = new int[N];	//第三个数组
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10000);	//第一组
			array2[i] = array[i];	//第二组 
			array3[i] = array[i];	//第三组
		}
		
		//打印输出
		System.out.println("排序前：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if ((i + 1) % 15 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
		
		//统计冒泡排序所用时间
		long startTime = System.currentTimeMillis();
		//冒泡排序
		for (int i = 0; i < array.length - 1; i++) {	//一共几轮
			for (int j = 0; j < array.length - i - 1; j++) {	//每一轮几次
				if (array[j] > array[j + 1]) {	//升序，<是降序	//什么时候进行交换
					int temp = array[j];	//临时变量temp
					array[j] = array[j + 1];
					array[j + 1]= temp; 
				}
			}
		}
		long endTime = System.currentTimeMillis();
		//打印排序所用时间
		System.err.println("\n冒泡排序所用的时间是：" + (endTime - startTime) + "毫秒！");

		//统计选择排序所用时间
		startTime = System.currentTimeMillis();
		//选择排序
		for (int i = 0; i < array2.length - 1; i++) {	//一共几轮
			int min = array2[i];	//假设第一个值是最小值
			int minIndex = i;		//最小值的下标
			for (int j = i + 1; j < array2.length; j++) {	//只做寻找最小值这一件事
				if (min > array2[j]) {
					min = array2[j];	//最小值
					minIndex = j;		//最小值的下标
				}
			}
			int temp = array2[i];
			array2[i] = array2[minIndex];
			array2[minIndex] = temp;
		}
		endTime = System.currentTimeMillis();
		//打印排序所用时间
		System.err.println("\n选择排序所用的时间是：" + (endTime - startTime) + "毫秒！");
		
		//统计选择排序所用时间
		startTime = System.currentTimeMillis();
		//sort()方法排序
		Arrays.sort(array3);
		/*
		 * Array.sort() 方法的逆序--> 首尾交换
		 * for (int i = 0; i < array3.length / 2; i++) {
		 * 		int temp = array3[i];
		 * 		array[i] = array3[array3.length - i - 1];
		 * 		array3[array3.length - i -1] = temp;
		 * }
		 */
		endTime = System.currentTimeMillis();
		//打印排序所用时间
		System.err.println("\nArray.sort()方法所用的时间是：" + (endTime - startTime) + "毫秒！");
		
		//打印输出
		System.out.println("排序后：");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if ((i + 1) % 15 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}
	}
	
	//二分查找法
	public static void ErFengChaZhao() {
		//声明数组
		int[] array = {5,10,15,25,35,45,55,65,75,85};
		//使用Scanner工具
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要查找的元素：");
		int searchNum = input.nextInt();
		
		boolean isFind = false;	//能否找到
		int low = 0;	//下界下标（小）
		int high = array.length - 1;	//上界下标（大）
		//不知道要查找几次
		while (high >= low) {
			//计算中点下标
			int mid = (high + low) / 2;
			if (searchNum > array[mid]) {
				low = mid + 1;	//核心代码，当输入的数字大于中间值时
			} else if (searchNum < array[mid]) {
				high= mid - 1;	//核心代码，当输入的数字小于中间值时
			} else {
				System.out.println("找到了，你查找数字的下标是：" + mid);
				isFind = true;
				break;
			}
		}
		if (!isFind) {
			System.out.println("没有找到，你要找的数字");
			System.exit(0);
		}
	}
	
	//删除元素
	public static void ShanChu() {
		//声明数组
		int[] array = {5,10,15,25,35,45,55,65,75,85};
		//使用Scanner工具
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要查找的元素：");
		int searchNum = input.nextInt();
		
		int deleteIndex = -1;	//要删除元素的小标
		int count = array.length - 1;	//当前数组元素的总个数
		boolean isFind = false;	//能否找到
		int low = 0;	//下界下标（小）
		int high = array.length - 1;	//上界下标（大）
		//不知道要查找几次
		while (high >= low) {
			//计算中点下标
			int mid = (high + low) / 2;
			if (searchNum > array[mid]) {
				low = mid + 1;	//核心代码，当输入的数字大于中间值时
			} else if (searchNum < array[mid]) {
				high= mid - 1;	//核心代码，当输入的数字小于中间值时
			} else {
				System.out.println("找到了，你查找数字的下标是：" + mid);
				deleteIndex = mid;
				isFind = true;
				break;
			}
		}
		if (!isFind || deleteIndex == -1) {
			System.out.println("没有找到，你要找的数字");
			System.exit(0);
		}
		
		//总长度-1
		count--;
		for (int i = deleteIndex; i < count; i++) {
			array[i] = array[i + 1];	//从删除下标开始，后面的元素依次向前覆盖
		}
		
		//遍历打印
		for (int i : array) {
			System.out.print("\t " + i);
		}
		/*
		 *插入元素---前提：一定也要是有序的
		 *1.找到第一个大于要插入元素的下标
		 *2.倒过来了，从最后一个元素开始：array[i + 1] = array[i]----直到insertIndex结束。
		 *3.在insert Index处赋值。
		 *4.总个数+1
		 *
		 * 二维数组：
		 * 一般是有行有列的情况会用到
		 * 行可以省略，但列不可以省略
		 * 
		 * 操作数组一般是控制数组的下标
		 * 用的时候用的是数组的元素
		 * 一维数组可以循环动态初始化
		 * 二维数组可以嵌套循环动态初始化
		 */
	}
}
