package com.shanxishuili.chapter02.mianxiangduixiang;
/**
 * 游戏的角色类
 * @author 小强
 * @date 2019年12月1日
 */
public class Role {
//名称：劳拉
//等级：25
//职业：考古学家
//技能：双枪
	/** 游戏角色的名称属性 */
	public String name;
	/** 角色的等级 */
	public int level;
	/** 角色的职业 */
	public String job;
	
	/**
	 * 默认构造方法
	 * 推荐写上（默认构造&带参构造）
	 * 培养一种良好的编程习惯
	 */
	public Role() {}
	
	/**
	 * 构造方法/构造器（利用的是构造方法的重载）
	 * 1、没有返回值
	 * 2、方法名和类名一样
	 * @param name 姓名
	 * @param level	等级
	 * @param job 职位
	 */
	public Role(String name, int level, String job) {
		this.name = name;
		this.level = level;
		this.job = job;
	}
	
	public void show() {
		System.out.println(name + "\t" + level + "\t" + job + "\t");
	}
	
	/**
	 * 释放技能
	 */
	public void doSkill() {
		if (name.equals("劳拉")) {
			System.out.println("劳拉的经典技能，双枪老太婆");
		} else if (name.equals("孙悟空")) {
			System.out.println("吃俺老孙一棒！！！");
		} else {
			System.out.println(name + "：发出了一击必杀！！！");
		}
	}
}
