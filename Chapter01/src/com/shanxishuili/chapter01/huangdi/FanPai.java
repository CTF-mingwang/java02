package com.shanxishuili.chapter01.huangdi;

import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FanPai {
	public static void XueFai() {
		//用户录入
		Scanner input = new Scanner(System.in);
		//后宫娘娘名字数组，预留5个名额
		String[] nnNameArray = {"西施","貂蝉","王昭君","杨玉环","赵飞燕","","","","",""};
		//娘娘等级数组
		String[] leveNames = {"贵人","嫔妃","贵妃","皇贵妃","皇后"};
		//对应每个娘娘的级别
		int[] leve1 = new int[10];
		//对应每个娘娘的好感度
		int[] loves = new int[10];
		//娘娘的初始数量为0
		int nnCount = 5;
		//游戏默认运行10天
		int gameDays = 1;
		
		//设定默认好感度初值为100
		for (int i = 0; i < nnCount; i++) {
			loves[i] = 100;
		}
		
		//大循环
		while (gameDays <= 10) {
			System.out.println("游戏进行到第" + gameDays + "天。");
			System.out.println("1、皇帝下旨选妃\t\t(增加)");
			System.out.println("2、翻牌宠幸\t\t(修改状态)");
			System.out.println("3、打入冷宫\t\t(删除)");
			System.out.println("4、朕的爱妃呢？\t\t(查找、修改状态)");
			System.out.print("陛下请选择：");
			int xueZhe = input.nextInt();	//录入整型
			//进行选择
			switch (xueZhe) {
			case 1://1、皇帝下旨选妃\t\t(增加)
				//控制添加范围
				if (nnCount == nnNameArray.length) {
					System.out.println("自己什么水平心里没点数？（添加失败！！！）");
					break;
				}
				System.out.print("请输入想要姑娘的名字：");
				String newName = input.next();
				//增加：姓名数组、好感度数组、级别数组
				nnNameArray[nnCount] = newName; //姓名
				loves[nnCount] = 100;	//好感度
				//其他娘娘的好感度-10
				for (int i = 0; i < nnCount; i++) {
					loves[i] -= 10;
				}
				nnCount++;
				break;
			case 2://2、翻牌宠幸\t\t(修改状态) +20 其他-10
				System.out.print("请输入想要姑娘的名字：");
				String name = input.next();
				//查找
				int searchIndex = -1;	//要查找字符串的下标
				//字符串排序：name.compareTo("abc") == 0;
				for (int i = 0; i < nnCount; i++) {
					if (name.compareTo(nnNameArray[i]) == 0) {//姓名相等的情况
						searchIndex = i;
						break;
					}
				}
				if (searchIndex == -1) {
					System.out.println("金钱有时候也不是万能的，要活在当下！！！");
					break;
				}
				//找到的情况：当前的好感度+20并升1级，其他人好感度-10
				loves[searchIndex] += 20;
				if (leve1[searchIndex] == leveNames.length - 1) {	//级别已经封顶了
					System.out.println(nnNameArray[searchIndex] + "这姑娘已经母仪天下了，晋级失败！！！");
					loves[searchIndex] += 10; 
					break;
				}
				leve1[searchIndex]++;
				
				for (int i = 0; i < nnCount; i++) {
					if (i == searchIndex) {
						continue;
					}
					loves[i] -= 10;
				}
				System.out.println("宠幸" + nnNameArray[searchIndex] + "好感度+10，升级为 " + leveNames[leve1[searchIndex]] + ",好感度+20，其她姑娘-10！");
				break;
			case 3://3、打入冷宫\t\t(删除)
				
				break;
			case 4://4、朕的爱妃呢？\t\t(查找、修改状态)
				
				break ;

			default:
				System.out.println("这个东西正在发明！！！");
				continue;
			}
			
			//循环打印-----为了每次循环都可以给我打印一遍
			System.out.println("姓名\t等级\t好感度");
			for (int i = 0; i < nnCount; i++) {
				System.out.println(nnNameArray[i] + "\t" + leveNames[leve1[i]] + "\t" + loves[i]);
			}
			
			//累加
			gameDays++;
		}
	}
	
	
	//图形界面
	public static void XueFai2() {
		//用户录入
		Scanner input = new Scanner(System.in);
		//后宫娘娘名字数组，预留5个名额
		String[] nnNameArray = {"西施","貂蝉","王昭君","杨玉环","赵飞燕","","","","",""};
		//野生美女，待选嫔妃
		String[] newNameArray = {"翠花","米莱迪","钟无艳","甄姬","苏小小"};
		//待选美女的总数
		int newNameCount = newNameArray.length;
		//娘娘等级数组
		String[] leveNames = {"贵人","嫔妃","贵妃","皇贵妃","皇后"};
		//对应每个娘娘的级别
		int[] leve1 = new int[10];
		//对应每个娘娘的好感度
		int[] loves = new int[10];
		//娘娘的初始数量为0
		int nnCount = 5;
		//游戏默认运行10天
		int gameDays = 1;
		
		//设定默认好感度初值为100
		for (int i = 0; i < nnCount; i++) {
			loves[i] = 100;
		}
		
		//游戏的主界面
		JOptionPane.showMessageDialog(null, "陛下，您来了！", "欢迎来到小营的后宫选妃游戏！！！", 1, new ImageIcon("images/皇帝.jpg"));
		//大循环
		while (gameDays <= 10) {
//			System.out.println("游戏进行到第" + gameDays + "天。");
//			System.out.println("1、皇帝下旨选妃\t\t(增加)");
//			System.out.println("2、翻牌宠幸\t\t(修改状态)");
//			System.out.println("3、打入冷宫\t\t(删除)");
//			System.out.println("4、朕的爱妃呢？\t\t(查找、修改状态)");
//			System.out.print("陛下请选择：");
//			int xueZhe = input.nextInt();	//录入整型
			
			String strMenu = "1、皇帝下旨选妃\n";
			strMenu += "2、翻牌宠幸\n";
			strMenu += "3、打入冷宫\n";
			strMenu += "4、朕的爱妃呢？\n";
			strMenu += "陛下请选择：";
			Object objReeult = JOptionPane.showInputDialog(null, strMenu, "游戏进行到第" + gameDays + "天", 0,
					new ImageIcon("images/" + gameDays + ".jpg"), new String[] {"1","2","3","4"}, 4);
			//要判断用户选择取消的情况
			if (objReeult == null) {//用户选择了取消
				continue;
			}
			//将用户选择（1-4）之间的字符转换成整型
			int choice = Integer.parseInt(objReeult.toString());
			//进行选择
			switch (choice) {
			case 1://1、皇帝下旨选妃\t\t(增加)
				//控制添加范围
				if (nnCount == nnNameArray.length) {
					System.out.println("自己什么水平心里没点数？（添加失败！！！）");
					break;
				}
//				System.out.print("请输入想要姑娘的名字：");
//				String newName = input.next();
				objReeult = JOptionPane.showInputDialog(null, "请选择秀女：", "选妃", 0,
						new ImageIcon("images/选妃.jpg"), newNameArray, null);
				if (objReeult == null) {//用户选择了取消
					continue;	//可以自行测试一下break和continue的区别
				}
				//"翠花","米莱迪","钟无艳","甄姬","苏小小"
				JOptionPane.showMessageDialog(null, objReeult.toString(), "选中的嫔妃：", 0, new ImageIcon("images/" + objReeult.toString() + ".jpg"));
				//增加：姓名数组、好感度数组、级别数组
				nnNameArray[nnCount] = objReeult.toString(); //姓名
				loves[nnCount] = 100;	//好感度
				//其他娘娘的好感度-10
				for (int i = 0; i < nnCount; i++) {
					loves[i] -= 10;
				}
				nnCount++;
				break;
			case 2://2、翻牌宠幸\t\t(修改状态) +20 其他-10
//				System.out.print("请输入想要姑娘的名字：");
//				String name = input.next();
				objReeult = JOptionPane.showInputDialog(null, "陛下请选择：", "翻牌：", 0,
						new ImageIcon("images/翻牌.jpg"), nnNameArray, null);
				if (objReeult == null) {//用户选择取消
					continue;
				}
				String name = objReeult.toString();	
				//查找
				int searchIndex = -1;	//要查找字符串的下标
				//字符串排序：name.compareTo("abc") == 0;
				for (int i = 0; i < nnCount; i++) {
					if (name.compareTo(nnNameArray[i]) == 0) {//姓名相等的情况
						searchIndex = i;
						break;
					}
				}
				if (searchIndex == -1) {
//					System.out.println("金钱有时候也不是万能的，要活在当下！！！");
					JOptionPane.showMessageDialog(null, "金钱有时候也不是万能的，要活在当下！！！");
					break;
				}
				//找到的情况：当前的好感度+20并升1级，其他人好感度-10
				loves[searchIndex] += 20;
				if (leve1[searchIndex] == leveNames.length - 1) {	//级别已经封顶了
					System.out.println(nnNameArray[searchIndex] + "这姑娘已经母仪天下了，晋级失败！！！");
					loves[searchIndex] += 10; 
//					break; //break从在影响了整个程序的运行，用else替换
					leve1[searchIndex]++;
					for (int i = 0; i < nnCount; i++) {
						if (i == searchIndex) {
							continue;
						}
						loves[i] -= 10;
					}
//					System.out.println("宠幸" + nnNameArray[searchIndex] + "好感度+10，升级为 " + leveNames[leve1[searchIndex]] + ",好感度+20，其她姑娘-10！");
					JOptionPane.showMessageDialog(null, "宠幸" + nnNameArray[searchIndex] + "好感度+10，升级为 " + leveNames[leve1[searchIndex]] + ",好感度+20，其她姑娘-10！",
							"翻牌的结果：", 0, new ImageIcon("images/" + nnNameArray[searchIndex] + ".jpg"));
				}
				
				break;
			case 3://3、打入冷宫\t\t(删除)
				
				break;
			case 4://4、朕的爱妃呢？\t\t(查找、修改状态)
				
				break ;

			default:
				System.out.println("这个东西正在发明！！！");
				continue;
			}
			
			//如果有三个以上的嫔妃好感度都低于60，那么发生暴乱，游戏强制退出！
			int count = 0;
			for (int i = 0; i < nnCount; i++) {
				if (loves[i] < 60 ) {
					count++;
				}
			}
			String reslutValue = "后宫有三个以上娘娘好感度低于60，发生暴乱！！！\n";
			reslutValue += new Date().toLocaleString();	//Date 他是util包里的
			if (count >= 3) {
				JOptionPane.showMessageDialog(null, reslutValue, "突发事件：后宫暴乱！", 0,
						new ImageIcon("images/暴乱.jpg"));
				System.exit(0);
			}
			
			//每日结算
			String value = "没羞没臊的生活又过了一天，后宫情况如下：\n";
			for (int i = 0; i < nnCount; i++) {
				value += String.format("%s   %s   %d\n", nnNameArray[i], leveNames[leve1[i]], loves[i]);
			}
			JOptionPane.showMessageDialog(null, value, "每日结算", 0, new ImageIcon("images/调戏.jpg"));
			//累加
			gameDays++;
		}
	}
}
