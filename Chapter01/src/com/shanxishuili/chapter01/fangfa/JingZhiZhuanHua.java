package com.shanxishuili.chapter01.fangfa;

public class JingZhiZhuanHua {
	/**
	 * 调用方法将10进制转换为16进制
	 * @param decNum 要转换的10进制数字
	 * @return 转换成16进制的数字（以字符串的方式返回）
	 */
	public static String decToHex(int decNum) {
		//45转16进制 = 45 / 16 反取余数
		String hex = "";	//转换好的16进制字符串
		while (decNum != 0) {
			int temp = decNum % 16;	//取余数
			//余数可能是0-9之间的数字或10-15之间的数字
			if (temp >= 0 && temp <= 9) {
				hex = temp + hex;	//每取一个余数，就往前拼接
			} else if (temp >= 10 && temp <= 15) {
				//把数字转换成字符,再拼接
				hex = (char)(temp - 10 + 'A') + hex;	//也可以temp % 10
			}
			//卸磨杀驴 ---去掉最后
			decNum /= 16;
		}
		return hex;
	}
	
	/**
	 * 十六进制转化为十进制
	 * @param hex 要转化的16进制字符串
	 * @return 转化成功的16进制数字
	 */
	public static int hexToDec(String hex) {
		int decNum = 0;	//设置一个取不到的值
		//6E --> 6 * 16 + 14 * 1	按权展开--个位0次方十位1次方。。。
		//需要遍历16进制字符串
		//规律：如果数组中首元素下标为i，那么最后一个元素的下标为：len - i - 1
		for (int i = 0; i < hex.length(); i++) {
			//取出字符串中的每一个字符进行判断
			char tempChar = hex.charAt(i);
			//两种情况：'0'-'9'	'A'-'F'
			if (tempChar >= '0' && tempChar <= '9') {
				decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);	//好好理解一下
			} else if (tempChar >= 'A' && tempChar <= 'F') {
				decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
			}
		}
		return decNum;
	}
}
