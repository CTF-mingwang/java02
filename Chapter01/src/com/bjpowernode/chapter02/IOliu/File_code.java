package com.bjpowernode.chapter02.IOliu;

import java.io.File;

public class File_code {

	public static void main(String[] args) {
		File file = new File("C:\\aow_drv.log");
		//读
		System.out.println(file.canRead());
		//写
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		System.out.println(file.isFile());
	}

}
