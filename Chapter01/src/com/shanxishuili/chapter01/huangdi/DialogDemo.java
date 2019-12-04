package com.shanxishuili.chapter01.huangdi;
/**
 * 对话框
 * @author 小强
 * 2019年11月24日
 */

import java.awt.Image;

import javax.swing.ImageIcon;
//Java的选项面板类
import javax.swing.JOptionPane;

public class DialogDemo {
	public static void main(String[] args) {
		//参数1：对话框的父窗体
//		JOptionPane.showMessageDialog(null, "提示信息");
		//参数2：对话框中的提示信息
		//参数3：对话框的标题信息
		//参数4：对话框的消息类型
//		JOptionPane.showMessageDialog(null, "晚上吃饭了吗？", "问候",JOptionPane.WARNING_MESSAGE);
		//参数5：对话框中显示的图片对象
//		JOptionPane.showMessageDialog(null, "王婧琦是你吗？", "憨憨", JOptionPane.WARNING_MESSAGE, new ImageIcon("images/001.jpg"));
		
		//牛逼的一个窗体
//		JOptionPane.showInputDialog(null, "吃了吗？", "标题", 0, new ImageIcon("images/001.jpg"), null, "默认值");
		JOptionPane.showInputDialog(null, "王二哈是你吗？", "困惑", 0, new ImageIcon("images/001.jpg"), new String[] {"1、你怎么知道的?","2、还是被你发现了！","3、你是瞎猜的对吧！"}, "想法：");
	}
}
